#!/bin/bash
# File: managed_server.sh
# Author: Sajeevan Achuthan


CEP_MEDIATION_HOME=/opt/ericsson/cep-mediation/cep-mediation

#Source the properties file
. $CEP_MEDIATION_HOME/bin/application.properties

STARTSTOP_LOG=$LOGGER_DIRECTORY/cep-mediation-startstop.log
HAZELCAST_CONFIG_PATH=$CONFIG_PATH/app-config/hazelcast.xml

JAVA_TUNING_VALUES="-Xms2000m -Xmx2000m -XX:+UseParallelGC -XX:+UseParallelOldGC -XX:MaxPermSize=900M -XX:ParallelGCThreads=2 -XX:ConcGCThreads=2"

# disable these for runtime; adjust for multiprocess installation....
#JMX_PROFILING_VALUES="-Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.port=1200"
JMX_PROFILING_VALUES=""



removeAndRecreateStartStopLogs() 
{

	if [ -e "$STARTSTOP_LOG" ]
	then
		rm $STARTSTOP_LOG
	fi
	touch $STARTSTOP_LOG
}

if [ $# -lt 1 ]
then
	echo "Usage: $0  [ start | stop | status]"
	exit 1
fi

case "$1" in
  start)
    echo "Starting Server...." 
    ;;
  stop)
    echo "Stopping Server...." 
    # no need for profiling when stopping server, plus port for JMX is already in use by application
    JMX_PROFILING_VALUES=""
    ;;
  *)
    echo "Usage: $0  [ start | stop | status]  "
    exit 1
    ;;
esac


CLASSPATH=.:$CONFIG_PATH:$CONFIG_PATH/app-config
for name in `ls $CEP_MEDIATION_HOME/lib/*.jar`
do
	CLASSPATH=$CLASSPATH:$name
done

TRACE="off"
JAVA_MAIN_APPLICATION_CLASS="com.ericsson.cepmediation.server.management.ApplicationStartStop"

JAVA_MAIN_STATUS_CHECK_CLASS="com.ericsson.cepmediation.server.monitoring.startupstatus.StartupStatusMain"

export CEP_MEDIATION_HOME=$CEP_MEDIATION_HOME

removeAndRecreateStartStopLogs

#-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5008
exec java -DCEP_MEDIATION_HOME=$CEP_MEDIATION_HOME  -cp ${CLASSPATH} -DprocessId=local -Dlog4j.configuration=$LOGGER_PATH -Dlog.directory=$LOGGER_DIRECTORY -Dhazelcast.config=$HAZELCAST_CONFIG_PATH $JMX_PROFILING_VALUES $JAVA_TUNING_VALUES $JAVA_MAIN_APPLICATION_CLASS  $1  >> ${OUTPUT} 2>&1 &

java -cp ${CLASSPATH} -Dlog4j.configuration=$LOGGER_PATH -Dlog.directory=$LOGGER_DIRECTORY $JAVA_MAIN_STATUS_CHECK_CLASS $STARTSTOP_LOG




