/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.cepmediation.base.licensing;

import java.net.MalformedURLException;
import java.rmi.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.cepmediation.base.properties.CepMediationProperties;
import com.ericsson.cepmediation.base.properties.CepMediationProperty;
import com.ericsson.eniq.licensing.cache.*;

public class LicensingService {
    private static final Logger logger = LoggerFactory.getLogger(LicensingService.class);

    private final static String SESSION_BROWSER_LICENCE_CXC = "CXC4011309";

    private final static String CFA_LICENCE_CXC = "CXC4011268";

    private final static String HFA_LICENCE_CXC = "CXC4011278";

    private final static String REESTABLISH_LICENCE_CXC = "CXC4011641";

    private final static String UERTT_LICENCE_CXC = "CXC4010504";

    private static final String DEFAULT_LICENCE_SERVICE_HOST = "licenceservice";

    private static final String DEFAULT_LICENCE_SERVICE_PORT = "1200";

    private static final String DEFAULT_LICENCE_SERVICE_NAME = "LicensingCache";

    private static final LicensingService instance = new LicensingService();

    // this class is singleton
    private LicensingService() {

    }

    public static LicensingService getInstance() {
        return instance;
    }

    public boolean hasCFALicense() throws CannotAccessLicensingServiceException {
        return hasLicenceImpl(CFA_LICENCE_CXC);
    }

    public boolean hasHFALicense() throws CannotAccessLicensingServiceException {
        return hasLicenceImpl(HFA_LICENCE_CXC);
    }

    public boolean hasSessionBrowserLicense() throws CannotAccessLicensingServiceException {
        return hasLicenceImpl(SESSION_BROWSER_LICENCE_CXC);
    }

    public boolean hasReestablishLicense() throws CannotAccessLicensingServiceException {
        return hasLicenceImpl(REESTABLISH_LICENCE_CXC);
    }

    public boolean hasUERTTLicense() throws CannotAccessLicensingServiceException {
        return hasLicenceImpl(UERTT_LICENCE_CXC);
    }

    private boolean hasLicenceImpl(String licence) throws CannotAccessLicensingServiceException {
        try {
            logger.info("cheking for licence " + licence + " ...");
            final LicensingCache licensingCache = getLicensingCacheFromRMIRegistry();
            final LicenseDescriptor licenseDescriptor = new DefaultLicenseDescriptor(licence);
            final LicensingResponse licensingResponse = licensingCache.checkLicense(licenseDescriptor);
            logger.info("licence valid: " + licensingResponse.isValid());
            return licensingResponse.isValid();
        } catch (final RemoteException e) {
            processExceptionWhenCannotAccessRemoteLicensingService(e);
        } catch (final MalformedURLException e) {
            processExceptionWhenCannotAccessRemoteLicensingService(e);
        } catch (final NotBoundException e) {
            processExceptionWhenCannotAccessRemoteLicensingService(e);
        }
        // will never hit this line, here to keep the compiler happy
        return false;
    }

    /**
     * handle exceptions coming from trying to access the remote RMI licensing service
     *
     * @param exceptionFromRMI
     * @throws CannotAccessLicensingService
     */
    private void processExceptionWhenCannotAccessRemoteLicensingService(final Exception exceptionFromRMI)
            throws CannotAccessLicensingServiceException {
        logger.error("Error getting licence!", exceptionFromRMI);
        throw new CannotAccessLicensingServiceException(exceptionFromRMI);
    }

    /**
     *
     * @return
     * @throws NotBoundException
     * @throws MalformedURLException
     * @throws RemoteException
     */
    LicensingCache getLicensingCacheFromRMIRegistry() throws NotBoundException, MalformedURLException, RemoteException {
        final String serviceUrl = determineURLOfLicensingService();
        logger.debug("looking up licensing service: " + serviceUrl);
        return (LicensingCache) Naming.lookup(serviceUrl);
    }

    /**
     * Based on the various properties and property files, put together the URL for the ENIQ RMI Licensing Service
     *
     * Result will be something like: rmi://licenceserver:1200/LicensingCache
     *
     * @return
     */
    private String determineURLOfLicensingService() {
        final String licensingHost = CepMediationProperties.getProperty(CepMediationProperty.LICENSE_SERVICE_HOST, DEFAULT_LICENCE_SERVICE_HOST);
        final String licensingPort = CepMediationProperties.getProperty(CepMediationProperty.LICENSE_SERVICE_PORT, DEFAULT_LICENCE_SERVICE_PORT);
        final String licensingServiceRMIName = CepMediationProperties.getProperty(CepMediationProperty.LICENSE_SERVICE_NAME,DEFAULT_LICENCE_SERVICE_NAME);

        return "rmi://" + licensingHost + ":" + licensingPort + "/" + licensingServiceRMIName;
    }
}
