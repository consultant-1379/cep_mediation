#!/bin/bash
# File: managed_server.sh
# Author: Sajeevan Achuthan

CEP_MEDIATION_PATH=/opt/ericsson/cep-mediation/cep-mediation
LOGGER_PATH=file://$CEP_MEDIATION_PATH/etc/app-config/log4j_stdout.properties

CLASSPATH=.:$CEP_MEDIATION_PATH/etc:$CEP_MEDIATION_PATH/etc/app-config
for name in `ls $CEP_MEDIATION_PATH/lib/*.jar`
do
	CLASSPATH=$CLASSPATH:$name
done

TRACE="off"
JAVA_MAIN_CLASS="com.ericsson.cepmediation.base.util.LocalConfig"

export cep_mediation_home=/opt/ericsson/cep-mediation/cep-mediation

exec java -Dcep_mediation_home=$cep_mediation_home  -cp ${CLASSPATH} -Dlog4j.configuration=$LOGGER_PATH $JAVA_MAIN_CLASS $1


