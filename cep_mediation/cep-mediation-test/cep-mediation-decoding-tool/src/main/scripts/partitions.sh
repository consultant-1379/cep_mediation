java -Xmx16G -Dlog4j.configuration=app-config/log4j.properties -cp /opt/decoding_tool/etc:/opt/decoding_tool/lib/*:/opt/decoding_tool/lib/ com.ericsson.cepmediation.decodingtool.Main "partitions" "$1" "$2" "$3"
