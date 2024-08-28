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
package com.ericsson.cepmediation.base.proc.config;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * 
 * This class encapsulates the correlation specific informations
 * @author eachsaj
 *
 */
public final class Correlation implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1176477504295857667L;

    //name of correlation
    private String name;

    // rules file with extension
    private String rule;
    
    private List<String> uses;

    //statements to be registered with correlation engine
    private List<String> statements;

    //events to be registered
    private List<String> events;

    private String listener;

    private String sessionDuration;

    public List<String> getUses() {
        return uses;
    }

    public void setUses(List<String> uses) {
        this.uses = uses;
    }

    public String getListener() {
        return listener;
    }

    public void setListener(final String listener) {
        this.listener = listener;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(final String rule) {
        this.rule = rule;
    }

    public List<String> getStatements() {
        return statements;
    }

    public void setStatements(final List<String> statements) {
        this.statements = statements;
    }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(final List<String> events) {
        this.events = events;
    }

    public void setSessionDuration(String sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    public String getSessionDuration() {
        return sessionDuration;
    }

    @Override
    public String toString() {
        return "Correlation [name=" + name + ", rule=" + (rule) + ", statements=" + (statements) + ", events=" + events + "]";
    }

}
