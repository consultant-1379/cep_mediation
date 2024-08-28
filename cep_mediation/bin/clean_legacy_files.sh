#!/bin/bash
# File: clean_legacy_files.sh
# Author: Mihail Nedkov

CEP_MEDIATION_HOME=/opt/ericsson/cep-mediation/cep-mediation

#Source the properties file
. $CEP_MEDIATION_HOME/bin/application.properties

CLASSPATH=.:$CONFIG_PATH/app-config/
for name in `ls $CEP_MEDIATION_HOME/lib/*.jar`
do
        CLASSPATH=$CLASSPATH:$name
done

java  -Dlog4j.configuration=file://$CONFIG_PATH/app-config/log4j_upgrade.properties -Dlog.directory=$LOGGER_DIRECTORY -cp ${CLASSPATH} "com.ericsson.cepmediation.loading.cleanup.LegacyFileCleaner"

if [ -e "$LOGGER_DIRECTORY/cep-mediation-upgrade.log" ]; then
	chown -R dcuser:dc5000 $LOGGER_DIRECTORY/cep-mediation-upgrade.log
fi
