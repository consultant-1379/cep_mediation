#!/bin/bash
# File: hypericSetup.sh
# Author:eurorad


#echo "Enter Number of Probes to Setup:"
#read NOPROBES


#./hqapi.sh agent list > agents.xml
#while  [ $NOPROBES -gt 0 ]; do

#        echo "Enter Probe Monitoring Agent Ip address:"
#        read AGENTIP

#        echo "Enter Probe Ip address:"
#        read PROBEIP

#        AGENTID=$(grep $AGENTIP agents.xml | awk -F "\"" '{printf("%s\n",  $2)}')

#        ./hqapi.sh resource createPlatform --prototype="Network Device" --agentId=$AGENTID --fqdn=netdevice.probe.$PROBEIP --ip=$AGENTIP --name="Ericsson Probe:$PROBEIP" -- interface.index=ifDescr snmpIp=$PROBEIP snmpPort=161 snmpVersion=v1 snmpCommunity=public

#        let NOPROBES=NOPROBES-1

#done

cat escalation.xml |  ./hqapi.sh escalation sync
echo "Setting up CEP Mediation Availability Alerts!!!"
./hqapi.sh alertdefinition create  --typeAlerts "CEP Mediation Server" --prototype "CEP Mediation Server" --name "CEP Server Availability" --metric Availability --equals 0 --assignEscalation "CEP Mediation Escalation"
./hqapi.sh alertdefinition create  --typeAlerts "CEP Mediation Server Process" --prototype "CEP Mediation Server Process" --name "CEP Process Availability" --metric Availability --equals 0 --assignEscalation "CEP Mediation Escalation"
./hqapi.sh alertdefinition create  --typeAlerts "CEP Mediation Server Captool Parser" --prototype "CEP Mediation Server Captool Parser" --name "CEP Captool Parser Availability" --metric Availability --equals 0 --assignEscalation "CEP Mediation Escalation"


./hqapi.sh alertdefinition create  --typeAlerts "NetworkServer Interface" --prototype "NetworkServer Interface" --name "Network Interface Availability" --metric Availability --equals 0 --assignEscalation "CEP Mediation Escalation"
#rm agents.xml
echo "Setup complete"
