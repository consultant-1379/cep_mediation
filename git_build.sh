#!/bin/bash

if [ "$2" == "" ]; then
	echo usage: $0 \<Module\> \<Branch\> \<Workspace\>
    	exit -1
else
	versionProperties=install/version.properties
	theDate=\#$(date +"%c")
	module=$1
	branch=$2
	PWD=$3
	BUILD_USER_ID=$4
    REASON=$5
	TAR_DIR="$PWD/tar"
	RPM_DIR="$TAR_DIR/packages"
	RPM_FILE=""
	CT="/usr/atria/bin/cleartool"
	release_area="/home/$USER/eniq_events_releases"
	path_to_built_rpm="$PWD/cep_mediation/ERICcep_CXP9022055/target/rpm/ERICcep_CXP9022055/RPMS/noarch"
	
fi

function getReason {
        if [ -n "$REASON" ]; then
        	REASON=`echo $REASON | sed 's/$\ /x/'`
            REASON=`echo JIRA:::$REASON | sed s/" "/,JIRA:::/g`
        else
            REASON="CI-DEV"
        fi
}

function getProductNumber {
        product=`cat $PWD/build.cfg | grep $module | grep $branch | awk -F " " '{print $3}'`
}

function getSprint {
        sprint=`cat $PWD/build.cfg | grep $module | grep $branch | awk -F " " '{print $5}'`
}

function setRstate {
        revision=`cat $PWD/build.cfg | grep $module | grep $branch | awk -F " " '{print $4}'`

        if git tag | grep $product-$revision; then
     		#rstate=`git tag | grep ${product}-${revision} | tail -1 | sed s/.*-// | perl -nle 'sub nxt{$_=shift;$l=length$_;sprintf"%0${l}d",++$_}print $1.nxt($2) if/^(.*?)(\d+$)/';`
	     	rstate=`git tag | grep ${product}-${revision} | sort -n -t"-" -k2.4 | tail -1 | sed s/.*-// | perl -nle 'sub nxt{$_=shift;$l=length$_;sprintf"%0${l}d",++$_}print $1.nxt($2) if/^(.*?)(\d+$)/';`
        else
            ammendment_level=01
		    rstate=$revision$ammendment_level
	    fi
}


function cleanup {
    if [ -d $TAR_DIR ] ; then
        echo "removing $TAR_DIR"
        rm -rf $TAR_DIR
    fi

	if [ -f $PWD/rstate.txt ] ; then
	   echo "removing $PWD/rstate.txt"
	   rm -rf $PWD/rstate.txt
	fi

	if [ -f $PWD/*tar.gz ] ; then
	   echo "Removing previously built tar.gz"
	   rm -rf $PWD/*tar.gz
	fi
}

function createTar {
    mkdir $TAR_DIR
    mkdir $RPM_DIR

    echo "Copying $RPM_FILE into $RPM_DIR"
    cp $RPM_FILE $RPM_DIR
    cd $TAR_DIR
    tar -czvf $PWD/$RPM_NAME packages/
    echo "Copying tar file into $release_area"
    cp $PWD/$RPM_NAME $release_area
}


cleanup #cleanup is only useful when builds are being run outside of Jenkins as Jenkins wipes the previously used workspace anyways
getSprint
getProductNumber
setRstate
getReason
RPM_NAME="cep_mediation_rpms_$rstate.tar.gz"
git clean -df
git checkout $branch
git pull

cd $PWD/cep_mediation
#mvn clean install -DskipTests -Dlog.directory=/home/eemecoy/logs/code-generation/ -Denforcer.skip=true -P main_profile -Droot.path=$PWD
/proj/eiffel013_config/fem101/jenkins_home/tools/apache-maven-3.0.4/bin/mvn clean install -DskipTests -Denforcer.skip=true -Droot.path=$WORKSPACE/workspace/eniq_cep_mediation
#cd $PWD/cep_mediation/ERICcep_CXP9022055
cd ERICcep_CXP9022055
#mvn clean install -DskipTests -Dlog.directory=/home/eemecoy/logs/code-generation/ -Denforcer.skip=true -P main_profile -Droot.path=$PWD -Drstate=$rstate
/proj/eiffel013_config/fem101/jenkins_home/tools/apache-maven-3.0.4/bin/mvn clean install -DskipTests -Denforcer.skip=true -Droot.path=$WORKSPACE/workspace/eniq_cep_mediation -Drstate=$rstate
rsp=$?

if [ $rsp == 0 ]; then
  git tag $product-$rstate
  git pull
  git push --tag origin $branch

  rpm=`ls $path_to_built_rpm`
  echo "RPM built:$rpm"
  RPM_FILE=$path_to_built_rpm/$rpm
  echo "Creating tar file..."
  createTar
  echo "Creating temporary rstate file for autodelivery. The file will contain $rstate"
  touch $PWD/rstate.txt
  echo $rstate >> $PWD/rstate.txt
  
if "${Deliver}"; then
	if [ "${DELIVERY_TYPE}" = "SPRINT" ]; then
    $CT setview -exec "/proj/eiffel013_config/fem101/jenkins_home/bin/lxb /vobs/dm_eniq/tools/scripts/deliver_eniq -auto events ${sprint} ${REASON} Y ${BUILD_USER_ID} ${product} NONE $release_area/$RPM_NAME" deliver_ui
else
    $CT setview -exec "/proj/eiffel013_config/fem101/jenkins_home/bin/lxb /vobs/dm_eniq/tools/scripts/eu_deliver_eniq -EU events ${sprint} ${REASON} Y ${BUILD_USER_ID} ${product} NONE $release_area/$RPM_NAME" deliver_ui
    fi
else
   echo "The delivery option was not selected.."
    fi
fi  

exit $rsp
