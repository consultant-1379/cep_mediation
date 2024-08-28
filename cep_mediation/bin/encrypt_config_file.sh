#!/bin/bash
# File: encrypt_config_file.sh
# Author: Vivek Kumar Ojha


CEP_MEDIATION_HOME=/opt/ericsson/cep-mediation/cep-mediation

CLASSPATH=.:$CONFIG_PATH:$CONFIG_PATH/app-config
for name in `ls $CEP_MEDIATION_HOME/lib/*.jar`
do
	CLASSPATH=$CLASSPATH:$name
done


JAVA_MAIN_CEP_ENCRYPT_CONFIG_CLASS="com.ericsson.cepmediation.autoconfig.util.EncryptConfig"

java -cp ${CLASSPATH} $JAVA_MAIN_CEP_ENCRYPT_CONFIG_CLASS




