/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.cepmediation.base.database.iq;

/**
 * All queries to IQ db are in this class.
 * 
 *
 * EQEV-1834 - refresh mechanism changed to load load changes since last refresh.
 *
 */
import static com.ericsson.cepmediation.base.database.templates.TemplateFiles.CFA_WHITELIST_VM;
import static com.ericsson.cepmediation.base.database.templates.TemplateFiles.HASH_ID_VM;
import static com.ericsson.cepmediation.base.database.templates.TemplateFiles.HFA_WHITELIST_VM;
import static com.ericsson.cepmediation.base.database.templates.TemplateFiles.HOME_PLMN_ID_VM;
import static com.ericsson.cepmediation.base.database.templates.TemplateFiles.IMSI_TO_IMEI_VM;
import static com.ericsson.cepmediation.base.database.templates.TemplateFiles.RNC_HASH_ID_VM;
import static com.ericsson.cepmediation.base.database.templates.TemplateFiles.SCRAMBLING_CODE_VM;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.database.CfaWhitelistTransformer;
import com.ericsson.cepmediation.base.database.HashIdTransformer;
import com.ericsson.cepmediation.base.database.HfaWhitelistTransformer;
import com.ericsson.cepmediation.base.database.HomePlmnIdTransformer;
import com.ericsson.cepmediation.base.database.ImsiToImeiTransformer;
import com.ericsson.cepmediation.base.database.RncHashIdTransformer;
import com.ericsson.cepmediation.base.database.ScramblingCodeTransformer;
import com.ericsson.cepmediation.base.database.Transformer;
import com.ericsson.cepmediation.base.database.entity.CellIdentifier;
import com.ericsson.cepmediation.base.database.entity.CfaWhitelistValues;
import com.ericsson.cepmediation.base.database.entity.HashId;
import com.ericsson.cepmediation.base.database.entity.MccMncPair;
import com.ericsson.cepmediation.base.database.entity.RabType;
import com.ericsson.cepmediation.base.database.entity.WhitelistValues;
import com.ericsson.cepmediation.base.database.templates.TemplateException;
import com.ericsson.cepmediation.base.database.templates.TemplateUtils;
import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;

public class IqDatabaseManager {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(IqDatabaseManager.class);

    private static final String MCC_MNC_SELECT = "SELECT mcc, mnc FROM dim_e_sgeh_mccmnc";

    private static final String PS_RABS_SELECT = "SELECT rabtype, category_id, rabtype_desc FROM dim_e_ran_rabtype WHERE rabtype is not null";

    private static final String GET_RNC_LIST = "select rnc.RNC_NAME,count(*) as CELL_NUMBER from dc.DIM_E_RAN_RNC rnc,(select * from dc.DIM_E_SGEH_HIER321_CELL ericCell where ericCell.STATUS='ACTIVE' union select * from dc.DIM_Z_SGEH_HIER321_CELL eCell where eCell.STATUS='ACTIVE')cell where rnc.STATUS='ACTIVE' and rnc.ALTERNATIVE_FDN = cell.HIERARCHY_3 group by rnc.RNC_NAME";

    private static final String GET_SGSN_LIST = "select SGSN_NAME from DIM_E_SGEH_SGSN where STATUS='ACTIVE' and SGSN_NAME is not null";

    private static final String GET_RNC_ID_2_OSS_ID = "select oss_id, rnc_id from dim_e_ran_rncfunction";

    private static IqDatabaseManager instance = new IqDatabaseManager();

    private static final SimpleDateFormat dateFormater = new SimpleDateFormat(
            "yyyy-MM-dd HH:mm");
    static {
        dateFormater.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private ConnectionFactory repdbConnectionFactory;

    private ConnectionFactory dwhdbConnectionFactory;

    public static IqDatabaseManager getInstance() {
        return instance;
    }

    IqDatabaseManager() {
        createDataSource();
    }

    private void createDataSource() {
        final String repdbUser = CepMediationProperties
                .getProperty(CepMediationProperty.IQ_REPDB_DATASOURCE_USER);
        final String repdbConn = CepMediationProperties
                .getProperty(CepMediationProperty.IQ_REPDB_DATASOURCE_CONNECTION);
        repdbConnectionFactory = createConnectionFactory(repdbUser, repdbConn);

        final String dwhdbUser = CepMediationProperties
                .getProperty(CepMediationProperty.IQ_DWHDB_DATASOURCE_USER);
        final String dwhdbConn = CepMediationProperties
                .getProperty(CepMediationProperty.IQ_DWHDB_DATASOURCE_CONNECTION);
        dwhdbConnectionFactory = createConnectionFactory(dwhdbUser, dwhdbConn);
    }

    ConnectionFactory createConnectionFactory(final String user,
            final String conn) {
        return new ConnectionFactory(user, conn);
    }

    public List getScramblingCodes(final Date lastUpdate) {
        List mapLists = null;
        try {
            mapLists = runQuery(SCRAMBLING_CODE_VM, lastUpdate,
                    new ScramblingCodeTransformer());
        } catch (final SQLException e) {
            LOGGER.error("Exception while loading scrambling code list ", e);
        } catch (final TemplateException e) {
            LOGGER.error("Exception loading SQL query", e);
        }
        return mapLists;
    }

    // This method is called from cep-standalone.
    public Map<Long, String> getImsi2imei() {
        Map<Long, String> result = new HashMap<Long, String>();

        try {
            result = runQuery(IMSI_TO_IMEI_VM, new ImsiToImeiTransformer());
        } catch (final SQLException e) {
            LOGGER.error("Exception while loading imsi to imei mappings", e);
        } catch (final TemplateException e) {
            LOGGER.error("Exception loading SQL query", e);
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    /*
     * This method gets the collection of HashIds from HEIR321 that have been
     * modified since we last got them. if lastUpdate is null - we get all
     * records since Jan 1st, 1970
     */
    public Map<CellIdentifier, List<HashId>> getHashIds(final Date lastUpdate) {
        Map<CellIdentifier, List<HashId>> result = null;
        try {
            result = runQuery(HASH_ID_VM, lastUpdate, new HashIdTransformer());
        } catch (final SQLException e) {
            LOGGER.error("Exception while loading hash id 3G managed list ", e);
        } catch (final TemplateException e) {
            LOGGER.error("Exception loading SQL query", e);
        }
        return result != null ? result : Collections.EMPTY_MAP;
    }

    @SuppressWarnings("unchecked")
    public Map<Short, Long> getRncHashIds() {
        Map<Short, Long> result = null;
        try {
            result = runQuery(RNC_HASH_ID_VM, new RncHashIdTransformer());
        } catch (final SQLException e) {
            LOGGER.error("Exception while loading rnc hash ids ", e);
        } catch (final TemplateException e) {
            LOGGER.error("Exception loading SQL query", e);
        }
        return result != null ? result : Collections.EMPTY_MAP;
    }

        @SuppressWarnings("unchecked")
    public Set<String> getHomePlmnIds() {
        Set<String> result = null;
        try {
            result = runQuery(HOME_PLMN_ID_VM, new HomePlmnIdTransformer());
        } catch (final SQLException e) {
            LOGGER.error("Exception while loading home plmnIds ", e);
        } catch (final TemplateException e) {
            LOGGER.error("Exception loading SQL query", e);
        }
        return result != null ? result : Collections.EMPTY_SET;
    }

    @SuppressWarnings("unchecked")
    public List<WhitelistValues> getHfaWhitelist() {
        List<WhitelistValues> result = null;
        try {
            result = runQuery(HFA_WHITELIST_VM, new HfaWhitelistTransformer());
        } catch (final SQLException e) {
            LOGGER.error("Exception while loading HfaWhiteList list ", e);
        } catch (final TemplateException e) {
            LOGGER.error("Exception loading SQL query", e);
        }
        return result != null ? result : Collections.EMPTY_LIST;
    }

    @SuppressWarnings("unchecked")
    public List<CfaWhitelistValues> getCfaWhitelist() {
        List<CfaWhitelistValues> result = null;
        try {
            result = runQuery(CFA_WHITELIST_VM, new CfaWhitelistTransformer());
        } catch (final SQLException e) {
            LOGGER.error("Exception while loading CfaWhiteList list ", e);
        } catch (final TemplateException e) {
            LOGGER.error("Exception loading SQL query", e);
        }
        return result != null ? result : Collections.EMPTY_LIST;
    }

    private <T> T runQuery(final String templateFile,
            final Transformer<T> transformer) throws SQLException,
            TemplateException {

        final Connection conn = getDwhdbConnection();
        Statement stat = null;
        ResultSet resultSet = null;
        try {
            stat = conn.createStatement();
            final String query = new TemplateUtils()
                    .getQueryFromTemplate(templateFile);
            resultSet = stat.executeQuery(query);
            return transformer.transform(resultSet);
        } finally {
            close(stat);
            close(conn);
        }

    }

    private <T> T runQuery(final String templateFile, final Date lastUpdate,
            final Transformer<T> transformer) throws SQLException,
            TemplateException {

        final Connection conn = getDwhdbConnection();
        Statement stat = null;
        ResultSet resultSet = null;

        String updateDate;
        if (lastUpdate == null) {
            updateDate = dateFormater.format(0);
        } else {
            updateDate = dateFormater.format(lastUpdate);
        }

        final String dateString = "'" + updateDate + "'";
        final Map<String, String> queryParameters = new HashMap<String, String>();
        queryParameters.put("lastUpdateTime", dateString);
        try {
            stat = conn.createStatement();
            final String query = new TemplateUtils().getQueryFromTemplate(
                    templateFile, queryParameters);
            resultSet = stat.executeQuery(query);
            return transformer.transform(resultSet);
        } finally {
            close(stat);
            close(conn);
        }

    }

    public Map<String, Integer> getUpClientList() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        final Connection conn = getDwhdbConnection();
        Statement stat = null;
        ResultSet resultSet = null;
        try {
            stat = conn.createStatement();
            resultSet = stat
                    .executeQuery("select client, client_desc from dim_e_user_plane_client");
            while (resultSet.next()) {
                final int id = resultSet.getInt("client");
                final String description = resultSet.getString("client_desc");
                map.put(description, id);
            }
        } catch (final SQLException e) {
            LOGGER.error("Exception while loading UP client list ", e);
        } finally {
            close(stat);
            close(conn);
        }
        return map;
    }

    public Map<String, Integer> getUpProviderList() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        final Connection conn = getDwhdbConnection();
        Statement stat = null;
        ResultSet resultSet = null;
        try {
            stat = conn.createStatement();
            resultSet = stat
                    .executeQuery("select service_provider, service_provider_desc from dim_e_user_plane_service_provider");
            while (resultSet.next()) {
                final int id = resultSet.getInt("service_provider");
                final String description = resultSet
                        .getString("service_provider_desc");
                map.put(description, id);
            }
        } catch (final SQLException e) {
            LOGGER.error("Exception while loading UP provider list ", e);
        } finally {
            close(stat);
            close(conn);
        }
        return map;
    }

    public Map<String, Integer> getUpFunctionList() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        final Connection conn = getDwhdbConnection();
        Statement stat = null;
        ResultSet resultSet = null;
        try {
            stat = conn.createStatement();
            resultSet = stat
                    .executeQuery("select function, function_desc from dim_e_user_plane_function");
            while (resultSet.next()) {
                final int id = resultSet.getInt("function");
                final String description = resultSet.getString("function_desc");
                map.put(description, id);
            }
        } catch (final SQLException e) {
            LOGGER.error("Exception while loading UP function list ", e);
        } finally {
            close(stat);
            close(conn);
        }
        return map;
    }

    public Map<String, Integer> getUpProtocolList() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        final Connection conn = getDwhdbConnection();
        Statement stat = null;
        ResultSet resultSet = null;
        try {
            stat = conn.createStatement();
            resultSet = stat
                    .executeQuery("select protocol, protocol_desc from dim_e_user_plane_protocol");
            while (resultSet.next()) {
                final int id = resultSet.getInt("protocol");
                final String description = resultSet.getString("protocol_desc");
                map.put(description, id);
            }
        } catch (final SQLException e) {
            LOGGER.error("Exception while loading UP protocol list ", e);
        } finally {
            close(stat);
            close(conn);
        }
        return map;
    }

    public Map<String, String> getRncId2OssIdMappings() {
        final Map<String, String> res = new HashMap<String, String>();
        final Connection conn = getDwhdbConnection();
        Statement stat = null;
        ResultSet resultSet = null;
        try {
            stat = conn.createStatement();
            resultSet = stat.executeQuery(GET_RNC_ID_2_OSS_ID);
            while (resultSet.next()) {
                final String ossId = resultSet.getString("oss_id");
                final String rncId = resultSet.getString("rnc_id");
                res.put(rncId, ossId);
            }
        } catch (final SQLException e) {
            LOGGER.error("Exception while loading UP protocol list ", e);
        } finally {
            close(stat);
            close(conn);
        }

        LOGGER.info("RncId 2 OssId mappings: " + res);

        return res;
    }

    public Map<String, Integer> getUpEncryptionList() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        final Connection conn = getDwhdbConnection();
        Statement stat = null;
        try {
            stat = conn.createStatement();
            final ResultSet rs = stat
                    .executeQuery("select encryption, encryption_desc from dim_e_user_plane_encryption");
            while (rs.next()) {
                final int id = rs.getInt("encryption");
                final String description = rs.getString("encryption_desc");
                map.put(description, id);
            }
        } catch (final SQLException e) {
            LOGGER.error("Exception while loading UP encryption list ", e);
        } finally {
            close(stat);
            close(conn);
        }
        return map;
    }

    public Map<String, Integer> getUpEncapsulationList() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        final Connection conn = getDwhdbConnection();
        Statement stat = null;
        try {
            stat = conn.createStatement();
            final ResultSet rs = stat
                    .executeQuery("select encapsulation, encapsulation_desc from dim_e_user_plane_encapsulation");
            while (rs.next()) {
                final int id = rs.getInt("encapsulation");
                final String description = rs.getString("encapsulation_desc");
                map.put(description, id);
            }
        } catch (final SQLException e) {
            LOGGER.error("Exception while loading UP encapsulation list ", e);
        } finally {
            close(stat);
            close(conn);
        }
        return map;
    }

    public List<RabType> getRabTypes() {
        final List<RabType> rabTypes = new ArrayList<RabType>();
        final Connection conn = getDwhdbConnection();
        Statement statement = null;
        try {
            statement = conn.createStatement();
            final ResultSet resultSet = statement.executeQuery(PS_RABS_SELECT);
            while (resultSet.next()) {
                final RabType rabType = new RabType();
                rabType.setRabType(resultSet.getInt("rabtype"));
                rabType.setRabTypeDesc(resultSet.getString("rabtype_desc"));
                rabType.setCategoryId(resultSet.getBoolean("category_id"));

                rabTypes.add(rabType);
            }
        } catch (final SQLException e) {
            LOGGER.error("Error executing query: " + PS_RABS_SELECT
                    + " Exception: " + e.getMessage());
        } finally {
            close(statement);
            close(conn);
        }
        return rabTypes;
    }

    public List<MccMncPair> getMccMncPairs() {
        final List<MccMncPair> mccMncPairs = new ArrayList<MccMncPair>();
        final Connection conn = getDwhdbConnection();
        Statement stat = null;
        try {
            stat = conn.createStatement();
            final ResultSet resultSet = stat.executeQuery(MCC_MNC_SELECT);
            while (resultSet.next()) {
                final String mcc = resultSet.getString(1);
                if (mcc != null && !mcc.isEmpty()) {
                    final String mnc = resultSet.getString(2);
                    if (mnc != null && !mnc.isEmpty()) {
                        final MccMncPair mccMncPair = new MccMncPair();
                        mccMncPair.setMcc(mcc);
                        mccMncPair.setMnc(mnc);
                        mccMncPairs.add(mccMncPair);
                    }
                }
            }
        } catch (final SQLException e) {
            LOGGER.error("Error executing query: " + e.getMessage());
        } finally {
            close(stat);
            close(conn);
        }

        return mccMncPairs;
    }

    public Map<String, String> getGPEHThresholdList() {
        final Map<String, String> map = new HashMap<String, String>();
        final Connection conn = getRepdbConnection();
        Statement stat = null;
        try {
            stat = conn.createStatement();
            final ResultSet rs = stat
                    .executeQuery("select name, threshold from Thresholds where techpack = 'EVENT_E_RAN_SESSION' and endtime = null");
            while (rs.next()) {
                final String name = rs.getString("name");
                final String threshold = rs.getString("threshold");
                map.put(name, threshold);
            }
        } catch (final SQLException e) {
            LOGGER.error("Exception while loading GPEH thresholds ", e);
        } finally {
            close(stat);
            close(conn);
        }
        return map;
    }

    /**
     * Get the rnc list and their network size
     * 
     * @return
     */
    public Map<String, Integer> getRNCList() {

        final Map<String, Integer> map = new HashMap<String, Integer>();
        final Connection conn = getDwhdbConnection();
        Statement stat = null;
        try {
            stat = conn.createStatement();
            final ResultSet resultSet = stat.executeQuery(GET_RNC_LIST);
            while (resultSet.next()) {
                final String rnc = resultSet.getString(1);
                final int cellNumber = resultSet.getInt(2);
                map.put(rnc, cellNumber);
            }
        } catch (final SQLException e) {
            LOGGER.error("Error executing query: " + e.getMessage());
        } finally {
            close(stat);
            close(conn);
        }

        return map;
    }

    /**
     * Get the sgsn list
     * 
     * @return
     */
    public List<String> getSGSNList() {

        final List<String> sgsnList = new ArrayList<String>();
        final Connection conn = getDwhdbConnection();
        Statement stat = null;
        try {
            stat = conn.createStatement();
            final ResultSet resultSet = stat.executeQuery(GET_SGSN_LIST);
            while (resultSet.next()) {
                final String sgsn = resultSet.getString(1);
                sgsnList.add(sgsn);
            }
        } catch (final SQLException e) {
            LOGGER.error("Error executing query: " + e.getMessage());
        } finally {
            close(stat);
            close(conn);
        }

        return sgsnList;
    }

    Connection getRepdbConnection() {
        try {
            return repdbConnectionFactory.getConnection();
        } catch (final SQLException e) {
            LOGGER.error(e.getMessage());
            throw new RuntimeException("Could not obtain connection to repdb!");
        }
    }

    Connection getDwhdbConnection() {
        try {
            return dwhdbConnectionFactory.getConnection();
        } catch (final SQLException e) {
            LOGGER.error(e.getMessage());
            throw new RuntimeException("Could not obtain connection to dwhdb!");
        }
    }

    private void close(final Statement stat) {
        if (stat != null) {
            try {
                stat.close();
            } catch (final SQLException e) {
                LOGGER.warn("Could not close statement: " + e.getMessage());
            }
        }
    }

    private void close(final Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (final SQLException e) {
                LOGGER.warn("Could not close connection: " + e.getMessage());
            }
        }
    }

    public static void main(final String[] args) {
        final long DAY_IN_MS = 1000 * 60 * 60 * 24;
        final Date start = new Date(System.currentTimeMillis() - (2 * DAY_IN_MS));
        Map<CellIdentifier, List<HashId>> ids = getInstance().getHashIds(start);
        System.out.println("Got " + ids.size() + " ids.");
        System.out.println(ids);
        ids = getInstance().getHashIds(null);
        System.out.println("Added " + ids.size() + " ids.");
        System.out.println(ids);
        System.out.println(getInstance().getGPEHThresholdList());
        System.out.println("Done");
    }

}