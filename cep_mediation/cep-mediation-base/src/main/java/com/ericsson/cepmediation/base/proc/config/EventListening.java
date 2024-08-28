package com.ericsson.cepmediation.base.proc.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.base.util.text.StringTrimmer;
import com.ericsson.cepmediation.config.bean.EventListeningType;

public class EventListening implements Serializable {
    public static final long serialVersionUID = 1;

    private final String topicName;

    private List<String> eventTypes;

    public EventListening(final EventListeningType eventListeningType) {
        this.topicName = eventListeningType.getTopicName();
        if (eventListeningType.getEventType() != null) {
            this.eventTypes = StringTrimmer.trimStrings(eventListeningType.getEventType().getName());
        } else {
            this.eventTypes = new ArrayList<String>();
        }
    }


    public String getTopicName() {
        return topicName;
    }

    public List<String> getEventTypes() {
        return eventTypes;
    }

}
