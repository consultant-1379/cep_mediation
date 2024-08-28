#!/bin/bash
## Define the root path of where the master set resides

masterDataSetPath="/home/eeikonl/eniq/master"
eniqDataSetPath="/home/eeikonl/eniq/data/temp"

## Get todays date
today=`date -u +"%Y%m%d"`
firstRun="/home/eeikonl/eniq/first.run"

## Get the current time
rop=`date -u +"%H%M"`

## If the endtime is 0000, we should use the previous days date, not the current date.
if [ $rop -eq "0000" ]
then
 today=`date --date="1 days ago" +"%Y%m%d"`
 echo "finding files for yesterday"
fi

#We only want to do this if this is the first run
if [ ! -a $firstRun ]
then
  ##Because we want our filenames and directory names relative to the master data directory, we pushd here
  pushd $masterDataSetPath > /dev/null
  find . -type d -exec mkdir -p ${eniqDataSetPath}/{} \;
  popd > /dev/null
fi

touch $firstRun

echo "Looking for rop files for $rop"

find "${masterDataSetPath}" -type f -name "*-${rop}*" -exec sh -c 'ln -s $1 `echo $1 | sed -e s:"$2":"$3": -e s:A[0-9]*:A$4:`' _ {} ${masterDataSetPath} ${eniqDataSetPath} ${today} \;
