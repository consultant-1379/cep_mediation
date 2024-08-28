#!/bin/bash
# File: autoconfig.sh
# Author: Vivek Kumar Ojha


CEP_MEDIATION_HOME=/opt/ericsson/cep-mediation/cep-mediation
LOGGER_PATH=file://$CEP_MEDIATION_HOME/etc/app-config/log4j_stdout.properties

CLASSPATH=.:$CONFIG_PATH:$CONFIG_PATH/app-config
for name in `ls $CEP_MEDIATION_HOME/lib/*.jar`
do
	CLASSPATH=$CLASSPATH:$name
done

PASSWORD=$1

JAVA_MAIN_CEP_AUTOCONFIG_CLASS="com.ericsson.cepmediation.autoconfig.util.EncryptPassword"

java -cp ${CLASSPATH} -Dlog4j.configuration=$LOGGER_PATH $JAVA_MAIN_CEP_AUTOCONFIG_CLASS $PASSWORD




