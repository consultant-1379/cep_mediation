/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.properties;

import com.ericsson.cepmediation.config.bean.AppStartTypeEnum;

/**
 * @author EEMECOY
 *
 */
public enum CepMediationProperty implements Property {

    JMX_PORT_STARTING_INDEX("jmx.port.starting.index", AppStartTypeEnum.CEP_MEDIATION),
    
    JMX_PROFILING_ON("jmx.profiling.on", AppStartTypeEnum.CEP_MEDIATION),

    BACKLOG_RECOVERY_INTERVAL("backlog.recovery.interval", AppStartTypeEnum.CEP_MEDIATION),

    GPEH_SUBFILE_CHECK("gpeh.subfile.check", AppStartTypeEnum.CEP_MEDIATION),

    GENERAL_PROBE_FILE_COLLECTION_MODE("general.probe.file.collection.mode", AppStartTypeEnum.CEP_MEDIATION),

    ADDITIONAL_GPEH_SERVER_COLLECTION_START_DELAY("additional.gpeh.server.collection.start.delay", AppStartTypeEnum.CEP_MEDIATION),

    IQ_BINARY_FILE_BYTE_ORDER("iq.binary.file.byte.order", AppStartTypeEnum.CEP_MEDIATION),

    GENERAL_OSS_SERVER_ALIAS_PREFIX("general.oss.server.alias.prefix", AppStartTypeEnum.CEP_MEDIATION),

    GENERAL_OSS_SERVER_IS_ADMIN_SERVER("general.oss.server.isAdminServer", AppStartTypeEnum.CEP_MEDIATION),

    CAPTOOL_DELETE_REMOTE_ROP_FILE("captool.deleteRemoteRopFile", AppStartTypeEnum.CEP_MEDIATION),

    GENERAL_SERVER_COLLECTION_INTERVAL("general.server.collection.interval", AppStartTypeEnum.CEP_MEDIATION),

    GENERAL_SERVER_COLLECTION_START_DELAY("general.server.collection.start.delay", AppStartTypeEnum.CEP_MEDIATION),

    GENERAL_PROBE_LOG_BATCH_SIZE("general.probe.log.batch.size", AppStartTypeEnum.CEP_MEDIATION),

    STAPLE_DELETE_REMOTE_ROP_FILE("staple.deleteRemoteRopFile", AppStartTypeEnum.CEP_MEDIATION),

    PUBLISHING_LOADING_SCAN_INTERVAL("publishing.loading.scan.interval", AppStartTypeEnum.CEP_MEDIATION),

    SGEH_MERGE_REPORT_THRESHOLD("sgeh.merge.report.threshold", AppStartTypeEnum.CEP_MEDIATION),

    SGEH_MERGE_SKIP("sgeh.merge.skip", AppStartTypeEnum.CEP_MEDIATION),

    TEST_FORWARD_UP_UNMATCHED("test.forward.up.unmatched", AppStartTypeEnum.CEP_MEDIATION),

    GENERAL_USERPLANE_RETRY_DELAY("general.userplane.retry.delay", AppStartTypeEnum.CEP_MEDIATION),

    GENERAL_USERPLANE_RETRY_COUNT("general.userplane.retry.count", AppStartTypeEnum.CEP_MEDIATION),

    UP_DROP_TCP_PARTIALS("up.drop.tcp.partials", AppStartTypeEnum.CEP_MEDIATION),

    INTERNAL_DISABLE_ISU("internal.disable.isu", AppStartTypeEnum.CEP_MEDIATION),

    RRC_MEASUREMENT_PROCESS_WITHOUT_SC("rrc.measurement.process.without.sc", AppStartTypeEnum.CEP_MEDIATION),

    PUBLISHING_CORRELATING_SCAN_INTERVAL("publishing.correlating.scan.interval", AppStartTypeEnum.CEP_MEDIATION),

    INTERNAL_ISU_TTL("internal.isu.ttl", AppStartTypeEnum.CEP_MEDIATION),

    DB_MAX_THREAD_COUNTER_DELAY("db.max.thread.counter.delay", AppStartTypeEnum.CEP_MEDIATION),

    DB_MAX_THREAD_COUNT("db.max.thread.count", AppStartTypeEnum.CEP_MEDIATION),

    DB_STORAGE_ACTIVE("db.storage.active", AppStartTypeEnum.CEP_MEDIATION),

    IQ_BINARY_FILE_BUFFER_SIZE("iq.binary.file.buffer.size", AppStartTypeEnum.CEP_MEDIATION),

    IQ_BINARY_DIRECTORY("iq.binary.directory", AppStartTypeEnum.CEP_MEDIATION),

    IQ_BINARY_FLUSH_INTERVAL("iq.binary.flush.interval", AppStartTypeEnum.CEP_MEDIATION),

    IQ_BINARY_FLUSH_RECORDS("iq.binary.flush.records", AppStartTypeEnum.CEP_MEDIATION),

    MAX_PERCENTAGE_USED_SPACE("max.percentage.used.space", AppStartTypeEnum.CEP_MEDIATION),

    FILESYSTEM_MONITOR_POLL_INTERVAL("filesystem.monitor.poll.interval", AppStartTypeEnum.CEP_MEDIATION),

    MAX_DISKSPACE_FILES("max.diskspace.files", AppStartTypeEnum.CEP_MEDIATION),

    INSTALL_DIR("install.dir", AppStartTypeEnum.CEP_MEDIATION),

    SERVER_VERSION("server.version", AppStartTypeEnum.CEP_MEDIATION), SERVER_TYPE("server.type", AppStartTypeEnum.CEP_MEDIATION),

    GENERAL_SERVER_RADIO_FILE_COLLECTION_MODE("general.server.radio.file.collection.mode", AppStartTypeEnum.CEP_MEDIATION),

    GENERAL_SERVER_CORE_FILE_COLLECTION_MODE("general.server.core.file.collection.mode", AppStartTypeEnum.CEP_MEDIATION),

    IP_PARTITION_TTL("ip.partition.ttl", AppStartTypeEnum.CEP_MEDIATION),

    SCHEMATYPE_XML_FILE("schematype.xml.file", AppStartTypeEnum.CEP_MEDIATION),

    SCHEMATYPE_SCHEMA("schematype.schema", AppStartTypeEnum.CEP_MEDIATION),

    SCHEMATYPE_NAMESPACE("schematype.namespace", AppStartTypeEnum.CEP_MEDIATION),

    IQ_DWHDB_DATASOURCE_CONNECTION("iq.dwhdb.datasource.connection", AppStartTypeEnum.CEP_MEDIATION),

    IQ_DWHDB_DATASOURCE_USER("iq.dwhdb.datasource.user", AppStartTypeEnum.CEP_MEDIATION),

    IQ_REPDB_DATASOURCE_CONNECTION("iq.repdb.datasource.connection", AppStartTypeEnum.CEP_MEDIATION),

    IQ_REPDB_DATASOURCE_USER("iq.repdb.datasource.user", AppStartTypeEnum.CEP_MEDIATION),

    PUBLISHING_BUFFER_SIZE("publishing.buffer.size", AppStartTypeEnum.CEP_MEDIATION),

    GPEH_PUBLISHING_BUFFER_SIZE("gpeh.publishing.buffer.size", AppStartTypeEnum.CEP_MEDIATION),

    EBS_PUBLISHING_BUFFER_SIZE("ebs.publishing.buffer.size", AppStartTypeEnum.CEP_MEDIATION),

    STATS_COLLECTION_ACTIVE("stats.collection.active", AppStartTypeEnum.CEP_MEDIATION),

    STATS_COLLECTION_PERIOD("stats.collection.period", AppStartTypeEnum.CEP_MEDIATION),

    GENERAL_FILECOPY_DESTINATION("general.filecopy.destination", AppStartTypeEnum.CEP_MEDIATION),

    JAVA_RMI_SERVER_PORT("java.rmi.server.port", AppStartTypeEnum.CEP_MEDIATION),

    LOOKUPSERVICE_CACHE_REFRESH_PERIOD("lookupservice.cache.refresh.period", AppStartTypeEnum.CEP_MEDIATION),

    LICENSE_SERVICE_HOST("licensing.service.host", AppStartTypeEnum.CEP_MEDIATION),

    LICENSE_SERVICE_PORT("licensing.service.port", AppStartTypeEnum.CEP_MEDIATION),

    LICENSE_SERVICE_NAME("licensing.service.name", AppStartTypeEnum.CEP_MEDIATION),

    PROBE_OUTPUTLOGLOCATION("probe.outputLogLocation", AppStartTypeEnum.PCP),

    GENERAL_PROBE_LOG_SERVER_PATH("general.probe.log.server.path", AppStartTypeEnum.PCP),

    PROBE_LOGFILEDIR("probe.logFileDir", AppStartTypeEnum.PCP),

    STAPLE_LOGFILE("staple.logFile", AppStartTypeEnum.PCP),

    STAPLE_OUTPUTTOFILE("staple.outputToFile", AppStartTypeEnum.PCP),

    STAPLE_SLOTTIME("staple.slotTime", AppStartTypeEnum.PCP),

    STAPLE_FLUSHPERIOD("staple.flushPeriod", AppStartTypeEnum.PCP),

    STAPLE_PUBLISHHAZELCAST("staple.publishInHazelcast", AppStartTypeEnum.PCP),

    STAPLE_TRACELEVEL("staple.traceLevel", AppStartTypeEnum.PCP),

    STAPLE_IGNOREL2DUPPACKETS("staple.ignoreL2DupPackets", AppStartTypeEnum.PCP),

    STAPLE_NOHTTPPROCESSING("staple.noHttpProcessing", AppStartTypeEnum.PCP),

    STAPLE_JNIPROCESS("staple.jniProcess", AppStartTypeEnum.PCP),

    GTPC_COLLECTOR("gtpc.collecter", AppStartTypeEnum.PCP),

    STAPLE_EXECUTABLE("staple.executable", AppStartTypeEnum.PCP),

    PCAP_MERGER("pcap.merger", AppStartTypeEnum.PCP),

    CAPTOOL_ROOTDIRECTORY("captool.rootdirectory", AppStartTypeEnum.PCP),

    CAPTOOL_INSTANCELOCALTION("captool.instanceLocation", AppStartTypeEnum.PCP),

    CAPTOOL_OUTPUTLOGLOCATION("captool.outputLogLocation", AppStartTypeEnum.PCP),

    CAPTOOL_SGSN_MAC_ADDRESS("captool.sgsn.mac.addresses", AppStartTypeEnum.PCP),

    PCAP_DISTRIBUTOR("pcap.distributor", AppStartTypeEnum.PCP),

    PCAP_DISTRIBUTOR_CONFIG_SOURCE("pcap.distributor.config.source", AppStartTypeEnum.PCP),

    PCAP_DISTRIBUTOR_CONFIG_DESTINATION("pcap.distributor.config.destination", AppStartTypeEnum.PCP),

    STAPLE_MERGER_CONFIG("pcap.merger.staple.config", AppStartTypeEnum.PCP),

    MERGER_CONFIG_SOURCE("pcap.merger.config.source", AppStartTypeEnum.PCP),

    STAPLE_COLLECTTCPTA("staple.collectTcpta", AppStartTypeEnum.PCP),

    STAPLE_COLLECT_TCPTA_PARTIAL("staple.collectTcptaPartial", AppStartTypeEnum.PCP),

    STAPLE_COLLECTFLV("staple.collectFlv", AppStartTypeEnum.PCP),

    STAPLE_COLLECT_FLV_PARTIAL("staple.collectFlvPartial", AppStartTypeEnum.PCP),

    STAPLE_COLLECT_WEBPAGE("staple.collectWebPage", AppStartTypeEnum.PCP),

    STAPLE_COLLECT_WEBREQ("staple.collectWebReq", AppStartTypeEnum.PCP),

    MERGER_ENABLE_MONITORING("merger.enableMonitoring", AppStartTypeEnum.PCP),

    IMEI_ENRICHMENT_HAZELCAST_FLUSH_INTERVAL("imei.enrichment.hazelcast.flush.interval", AppStartTypeEnum.CEP_MEDIATION),

    INTERVAL_PRODUCE_OUTPUT_CORRELATED_EVENTS("interval.produce.output.correlated.events", AppStartTypeEnum.CEP_MEDIATION),

    GPEH_MOUNT_POINT("gpeh.mount.point", AppStartTypeEnum.CEP_MEDIATION),

    CEP_MEDIATION_INI("cep.mediation.ini", AppStartTypeEnum.CEP_MEDIATION),

    GPEH_PROCESS_MEMORY_RATIO("gpeh.process.memory.ratio", AppStartTypeEnum.CEP_MEDIATION),

    AUTO_GENERATION_LOCATION("auto.genertaion.location", AppStartTypeEnum.CEP_MEDIATION);

    private String propertyName;

    private AppStartTypeEnum requiredAppStartTypeEnum;

    CepMediationProperty(final String propertyName, final AppStartTypeEnum required) {
        this.propertyName = propertyName;
        this.requiredAppStartTypeEnum = required;
    }

    @Override
    public String getPropertyName() {
        return propertyName;
    }

    public AppStartTypeEnum getRequiredAppStartTypeEnum() {
        return this.requiredAppStartTypeEnum;
    }

}
