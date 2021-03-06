package com.chatting.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChangeStatusMessage extends Message {
    public static final String type = "change.status";
    public final String event = "change.status";
    public String status;
}
