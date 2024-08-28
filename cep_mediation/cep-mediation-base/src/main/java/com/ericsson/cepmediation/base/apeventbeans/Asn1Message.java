package com.ericsson.cepmediation.base.apeventbeans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * This class holds a single ASN.1 message that is encapsulated in a MESSAGE_CONTENTS parameter in
 * an event.
 * 
 * @author eeilfn
 */

public class Asn1Message implements Serializable {
    /**
     * The serial version of this class
     */
    private static final long serialVersionUID = -5012122814899946087L;

    // The name of the message
    private String messageName = "";

    // The attributes of the message
    private Map<String, String> messageAttributes = new HashMap<String, String>();

    /**
     * Dump the contents of the message to a string
     * @return The message as a string
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();

        builder.append(messageName);
        builder.append('[');

        boolean first = true;
        for (final String attribute : messageAttributes.keySet()) {
            if (first) {
                first = false;
            } else {
                builder.append(',');
            }
            builder.append(attribute);
            builder.append(':');
            builder.append(messageAttributes.get(attribute));
        }

        builder.append(']');

        return builder.toString();
    }

    /**
     * Getters and setters from here
     */

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(final String messageName) {
        this.messageName = messageName;
    }

    public Map<String, String> getMessageAttributes() {
        return messageAttributes;
    }

    public void setMessageAttributes(final Map<String, String> messageAttributes) {
        this.messageAttributes = messageAttributes;
    }
}