package com.ericsson.cepmediation.automation.configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import com.ericsson.cepmediation.base.resourceloading.ResourceFileFinder;
import com.ericsson.cepmediation.base.resourceloading.ResourceLoadingFailedException;

public class PropertiesReader {
    private ResourceFileFinder finder = new ResourceFileFinder();

    public Properties readProps(String file) throws ResourceLoadingFailedException, IOException {
        Properties res = new Properties();
        BufferedReader in = new BufferedReader(new InputStreamReader(finder.findResourceFile(file)));
        String line = null;
        boolean propStarted = false;
        String key = null;
        while ((line = in.readLine()) != null) {
            line = line.trim();
            if (line.indexOf("</properties>") > -1) {
                return res;
            } else if (line.indexOf("<property>") > -1) {
                propStarted = true;
            } else if (line.indexOf("</property>") > -1) {
                propStarted = false;
                key = null;
            } else if (line.indexOf("<key>") > -1 && propStarted) {
                int posStart = line.indexOf("<key>") + "<key>".length();
                int posEnd = line.indexOf("</key>");
                key = line.substring(posStart, posEnd);
            } else if (line.indexOf("<value>") > -1 && propStarted) {
                int posStart = line.indexOf("<value>") + "<value>".length();
                int posEnd = line.indexOf("</value>");
                String val = line.substring(posStart, posEnd);
                if (key == null) {
                    throw new IllegalArgumentException("Null key for value: " + line);
                }
                res.put(key, val);
            }
        }
        return res;
    }

    public static void main(String[] args) throws ResourceLoadingFailedException, IOException {
        PropertiesReader reader = new PropertiesReader();
        Properties prosp = reader.readProps("automated_test_config/config.xml");
        System.out.println(prosp);
    }
}
