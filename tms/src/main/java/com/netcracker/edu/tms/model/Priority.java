package com.netcracker.edu.tms.model;

import lombok.Getter;


    public enum Priority {
        MINOR,
        MAJOR,
        CRITICAL,
        BLOCKER;

        @Getter
        private String priorityValue;

    }

