#!/bin/bash
# File: autoconfig.sh
# Author: Vivek Kumar Ojha

if [ $EUID -ne 308 ] ; then
    echo "This script must be run as dcuser" 1>&2
    exit 1
fi

CEP_MEDIATION_HOME=/opt/ericsson/cep-mediation/cep-mediation
LOGGER_PATH=file://$CEP_MEDIATION_HOME/etc/app-config/log4j_stdout.properties

backup_files(){

`cp $CEP_MEDIATION_HOME/etc/app-config/network_elements.xml $CEP_MEDIATION_HOME/etc/app-config/network_elements.xml.backup`

`cp $CEP_MEDIATION_HOME/etc/app-config/standalone.xml $CEP_MEDIATION_HOME/etc/app-config/standalone.xml.backup`

`cp $CEP_MEDIATION_HOME/etc/app-config/hazelcast.xml $CEP_MEDIATION_HOME/etc/app-config/hazelcast.xml.backup`

}

scpFiles(){

LOC=$CEP_MEDIATION_HOME/etc/app-config/
FILE=network_elements.xml
STANDALONE=standalone.xml
HAZELCAST=hazelcast.xml
HOST=`find "$LOC" -name "network_elements.xml_*" |  cut -d "_" -f3`
for i in ${HOST[@]}
do
    if [[ $i =~ ^[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}$ ]]
    then
        scp "$LOC$STANDALONE" "$i":"$LOC$STANDALONE"
        scp "$LOC$HAZELCAST" "$i":"$LOC$HAZELCAST"
        scp "$LOC$FILE"_"$i" "$i":"$LOC$FILE"
        if [ $? -eq 0 ]
        then
         rm -f "$LOC$FILE"_"$i"
        fi
    fi
done

}

CLASSPATH=.:$CONFIG_PATH:$CONFIG_PATH/app-config
for name in `ls $CEP_MEDIATION_HOME/lib/*.jar`
do
	CLASSPATH=$CLASSPATH:$name
done

JAVA_MAIN_CEP_AUTOCONFIG_CLASS="com.ericsson.cepmediation.autoconfig.CepAutoconfig"

backup_files

java -cp ${CLASSPATH} -Dlog4j.configuration=$LOGGER_PATH $JAVA_MAIN_CEP_AUTOCONFIG_CLASS

scpFiles
