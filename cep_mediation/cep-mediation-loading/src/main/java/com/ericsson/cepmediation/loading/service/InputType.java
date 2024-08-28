package com.ericsson.cepmediation.loading.service;

/**
 * This ENUM is used to determine the type of parser to be instantiated and used
 * for certain input files 
 * @author eachsaj
 */

public enum InputType {

    // EBS files from the MME
    EBS,
    // Staple files from probes
    STAPLE,
    // Captool files from probes
    CAPTOOL,
    // GPEH files from the RNC
    GPEH
}
