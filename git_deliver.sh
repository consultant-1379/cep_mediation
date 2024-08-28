#!/bin/bash
# ### 19/02/2015 -  THIS FILE IS NOT IN USE CURRENTLY FOR PACKAGE DELIVERY ### #
# ###               REFER git_build.sh FOR DELIVERY                        ### #

module=$1
userId=$2
workspace=$3
branch=$4
reason=$5
CT=/usr/atria/bin/cleartool
cep_pkg_dir="/proj/jkadm100/eniq_events_releases"
GIT=/app/git/1.7.8/LMWP3/bin/git

cat $workspace/rstate.txt

function getReason {
        if [ -n "$reason" ]; then
        	reason=`echo $reason | sed 's/$\ /x/'`
            reason=`echo JIRA:::$reason | sed s/" "/,JIRA:::/g`
        else
            reason="CI-DEV"
        fi
}

function getProductNumber {
        product=`cat $workspace/build.cfg | grep $module | grep $branch | awk -F " " '{print $3}'`
}

function getSprint {
        sprint=`cat $workspace/build.cfg | grep $module | grep $branch | awk -F " " '{print $5}'`
}

function getCepPkg {
	cep_pkg=`ls -lrt $cep_pkg_dir | grep cep| grep $rstate | tail -1 | awk '{print $9}'`
}

function deliverCep {
	echo "Running command: /vobs/dm_eniq/tools/scripts/deliver_eniq -auto events $sprint $reason N $userId $product NONE $cep_pkg_dir/$cep_pkg"
	$CT setview -exec \"/vobs/dm_eniq/tools/scripts/deliver_eniq -auto events $sprint $reason N $userId $product NONE $cep_pkg_dir/$cep_pkg\" deliver_ui
}

function getRstate {
	rstate=`cat $workspace/rstate.txt`
	rm -rf $workspace/rstate.txt
}

getRstate
$GIT checkout master #Switching to master to support deliver using master's build.cfg
$GIT pull --rebase
cat $workspace/build.cfg
getReason
getProductNumber
getSprint
getCepPkg
deliverCep

