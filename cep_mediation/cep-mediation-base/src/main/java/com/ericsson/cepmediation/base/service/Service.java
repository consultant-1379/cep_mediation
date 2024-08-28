/**
 * (C) Copyright LM Ericsson System Expertise AT/LMI, 2011
 *
 * The copyright to the computer program(s) herein is the property of Ericsson
 * System Expertise EEI, Sweden. The program(s) may be used and/or copied only
 * with the written permission from Ericsson System Expertise AT/LMI or in
 * accordance with the terms and conditions stipulated in the agreement/contract
 * under which the program(s) have been supplied.
 *
 */

package com.ericsson.cepmediation.base.service;

/**
 * A common marker interface definition of all services in the system. This interface
 * must be implemented all CEP Mediation services that needs to integrated with the
 * CEP Mediation Server.
 * 
 * This interface to be used as Marker interface to differentiate Process and Service
 * 
 * @author eachsaj
 * @category Base
 * 
 */
public interface Service extends CepMediationProcess {

}
