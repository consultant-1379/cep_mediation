#!/bin/bash

# This server can only be started as root
if [[ $EUID -ne 0 ]]; then
   echo "This script must be run as root" 1>&2
   exit 1
fi

serviceNameLo="pre-datagen"                                  # service name with the first letter in lowercase
serviceName="Pre-Datagen" 									 # service name
javaCommandLine="java -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.port=1200 -Xmx90G -XX:MaxPermSize=700M -XX:+UseParallelGC -XX:+UseParallelOldGC -XX:ParallelGCThreads=2 -XX:ConcGCThreads=2 -Dlog.directory -d64 -Dlog4j.configuration=app-config/log4j.properties -Dlog.directory=/var/log/ericsson/cep-mediation-datagen-precook -cp ./../etc:./../lib/*:./../lib/ com.ericsson.eniq.events.cepmediation.datagen_precook.LaunchDatagen "$2" "$3" "$4""                    
pidFile="/var/run/$serviceNameLo.pid"                      # name of PID file (PID = process ID number)
serviceLogFile="/var/log/$serviceNameLo.log"               # log file for StdOut/StdErr
maxShutdownTime=15                                         # maximum number of seconds to wait for the daemon to terminate normally
serviceGroup="dcuser"   

# Makes the file $1 writable by the group $serviceGroup.
function makeFileWritable {
   local filename="$1"
   touch $filename || return 1
   chgrp $serviceGroup $filename || return 1
   chmod g+w $filename || return 1
   return 0; }

function startServiceProcess {
	rm -f $pidFile
	makeFileWritable $pidFile || return 1
    makeFileWritable $serviceLogFile || return 1
	cmd="nohup $javaCommandLine >>$serviceLogFile 2>&1 & echo \$! >$pidFile"
	su -m dcuser -s $SHELL -c "$cmd" || return 1
   sleep 1
   pid="$(<$pidFile)"
   if checkProcessIsRunning $pid; then :; else
      echo -ne "\n$serviceName start failed, see logfile."
      return 1
   fi
   return 0;
}

# Returns 0 if the process with PID $1 is running.*
function checkProcessIsRunning {
   local pid="$1"
   if [ -z "$pid" -o "$pid" == " " ]; then return 1; fi
   if [ ! -e /proc/$pid ]; then return 1; fi
   return 0; }
   
function getServicePID {
   if [ ! -f $pidFile ]; then return 1; fi
   pid="$(<$pidFile)"
   checkProcessIsRunning $pid || return 1
   return 0; }
   
   
function stopServiceProcess {
   kill $pid || return 1
   for ((i=0; i<maxShutdownTime*10; i++)); do
      checkProcessIsRunning $pid
      if [ $? -ne 0 ]; then
         rm -f $pidFile
         return 0
         fi
      sleep 1
      done
   echo -e "\n$serviceName did not terminate within $maxShutdownTime seconds, sending SIGKILL..."
   kill -s KILL $pid || return 1
   local killWaitTime=15
   for ((i=0; i<killWaitTime*10; i++)); do
      checkProcessIsRunning $pid
      if [ $? -ne 0 ]; then
         rm -f $pidFile
         return 0
         fi
      sleep 1
      done
   echo "Error: $serviceName could not be stopped within $maxShutdownTime+$killWaitTime seconds!"
   return 1; }
   
function stopService {
   getServicePID
   if [ $? -ne 0 ]; then echo -n "$serviceName is not running"; RETVAL=0; echo ""; return 0; fi
   echo -n "Stopping $serviceName   "
   stopServiceProcess
   if [ $? -ne 0 ]; then RETVAL=1; echo "failed"; return 1; fi
   echo "stopped PID=$pid"
   RETVAL=0
   return 0; }
   
function startService {
   getServicePID
   if [ $? -eq 0 ]; then echo -n "$serviceName is already running"; RETVAL=0; return 0; fi
   echo -n "Starting $serviceName   "
   startServiceProcess
   if [ $? -ne 0 ]; then RETVAL=1; echo "failed"; return 1; fi
   echo "started PID=$pid"
   RETVAL=0
   return 0; }
   
   
function checkServiceStatus {
   echo -n "Checking for $serviceName:   "
   if getServicePID; then
	echo "running PID=$pid"
	RETVAL=0
   else
	echo "stopped"
	RETVAL=3
   fi
   return 0; }
   
function main {
   RETVAL=0
   case "$1" in
      start)                                               # starts the Java program as a Linux service
         startService
         ;;
      stop)                                                # stops the Java program service
         stopService
         ;;
      restart)                                             # stops and restarts the service
         stopService && startService
         ;;
      status)                                              # displays the service status
         checkServiceStatus
         ;;
      *)
         echo "Usage: $0 {start|stop|restart|status}"
         exit 1
         ;;
      esac
   exit $RETVAL
}

main $1

