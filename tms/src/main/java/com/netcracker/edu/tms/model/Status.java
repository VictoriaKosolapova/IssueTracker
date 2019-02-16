package com.netcracker.edu.tms.model;

import lombok.Getter;

import lombok.Setter;

public enum Status {

        NOT_STARTED,
        CANCELED,
        IN_PROGRES,
        RESOLVED,
        CLOSED;

        @Getter
        @Setter
        private String statusValue;


    }
