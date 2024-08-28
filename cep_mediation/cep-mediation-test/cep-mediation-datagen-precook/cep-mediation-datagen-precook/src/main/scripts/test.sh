#!/bin/bash
## Define the root path of where the master set resides
masterDataSetPath="/home/eeikonl/eniq/master"
eniqDataSetPath="/home/eeikonl/eniq/data/"
eniqDataTempPath="/home/eeikonl/eniq/data/temp"
## Get todays date
today=`date +"%Y%m%d"`
firstRun="/home/eeikonl/eniq/first.run"
## Get the current time

rop=`date +"%H%M"`
##Because we want our filenames and directory names relative to the master data directory, we pushd here
#We only want to do this if this is the first run
if [ ! -a $firstRun ]
then
pushd $masterDataSetPath > /dev/null
find . -type d -exec mkdir -p ${eniqDataTempPath}/{} \;
popd > /dev/null
fi
touch $firstRun
echo "Looking for rop files for $rop"
find "${masterDataSetPath}" -type f -name "*${rop}-*" -exec sh -c 'ln -s $1 `echo $1 | sed -e s:"$2":"$3": -e s:A[0-9]*:A$4:`' _ {} ${masterDataSetPath} ${eniqDataTempPath} ${today} \;
