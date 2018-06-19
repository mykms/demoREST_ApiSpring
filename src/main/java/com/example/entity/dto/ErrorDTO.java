package com.example.entity.dto;

import java.io.Serializable;

public class ErrorDTO implements Serializable {
    private int code;
    private String messageshort;
    private String messageFull;

    public ErrorDTO() {
    }

    public ErrorDTO(int code, String messageshort, String messageFull) {
        this.code = code;
        this.messageshort = messageshort;
        this.messageFull = messageFull;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessageshort() {
        return messageshort;
    }

    public void setMessageshort(String messageshort) {
        this.messageshort = messageshort;
    }

    public String getMessageFull() {
        return messageFull;
    }

    public void setMessageFull(String messageFull) {
        this.messageFull = messageFull;
    }
}
