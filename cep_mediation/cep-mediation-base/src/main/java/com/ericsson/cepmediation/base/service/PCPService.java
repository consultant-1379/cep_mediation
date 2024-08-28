package com.ericsson.cepmediation.base.service;

import java.util.NoSuchElementException;

/**
 * (C) Copyright LM Ericsson System Expertise AT/LMI, 2011
 * <p/>
 * The copyright to the computer program(s) herein is the property of Ericsson
 * System Expertise EEI, Sweden. The program(s) may be used and/or copied only
 * with the written permission from Ericsson System Expertise AT/LMI or in
 * accordance with the terms and conditions stipulated in the agreement/contract
 * under which the program(s) have been supplied.
 *
 * @author: ezhelao
 * Description :
 */
public interface PCPService extends Service{
	PCPServiceExecuter getServiceExecuterInstance() throws NoSuchElementException;

}
