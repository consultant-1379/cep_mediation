#!/bin/bash
# File: check_status.sh
# Author: Emer Coyle


CEP_MEDIATION_HOME=/opt/ericsson/cep-mediation/cep-mediation

#Source the properties file
. $CEP_MEDIATION_HOME/bin/application.properties


CLASSPATH=.:$CONFIG_PATH:$CONFIG_PATH/app-config
for name in `ls $CEP_MEDIATION_HOME/lib/*.jar`
do
	CLASSPATH=$CLASSPATH:$name
done


JAVA_MAIN_CHECK_SYSTEM_STATUS_CLASS="com.ericsson.cepmediation.server.monitoring.systemstatus.ApplicationStatus"

java -cp ${CLASSPATH} -Dlog4j.configuration=$LOGGER_PATH -Dlog.directory=$LOGGER_DIRECTORY $JAVA_MAIN_CHECK_SYSTEM_STATUS_CLASS




