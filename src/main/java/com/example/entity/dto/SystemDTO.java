package com.example.entity.dto;

import java.io.Serializable;
import java.util.Calendar;

public class SystemDTO implements Serializable {
    private final long serverDateTime = Calendar.getInstance().getTimeInMillis();
    private final String serverVersion = "1.0";

    public SystemDTO() {
    }

    public long getServerDateTime() {
        return serverDateTime;
    }

    public String getServerVersion() {
        return serverVersion;
    }
}
