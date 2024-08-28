#!/bin/bash

CEP_MEDIATION_HOME=/opt/ericsson/cep-mediation/cep-mediation

#Source the properties file
. $CEP_MEDIATION_HOME/bin/application.properties

CLASSPATH=.:$CONFIG_PATH:$CONFIG_PATH/app-config
for name in `ls $CEP_MEDIATION_HOME/lib/*.jar`
do
	CLASSPATH=$CLASSPATH:$name
done

TRACE="off"
JAVA_MAIN_APPLICATION_CLASS="com.ericsson.cepmediation.evolution.core.Main"

export CEP_MEDIATION_HOME=$CEP_MEDIATION_HOME

exec java -DCEP_MEDIATION_HOME=$CEP_MEDIATION_HOME  -cp ${CLASSPATH} -Dlog4j.configuration=$LOGGER_PATH -Dlog.directory=$LOGGER_DIRECTORY -Dhazelcast.config=$HAZELCAST_CONFIG_PATH $JMX_PROFILING_VALUES $JAVA_MAIN_APPLICATION_CLASS $*



