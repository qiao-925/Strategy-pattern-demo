package com.example.demo.enums;

public enum ProcessorIdentityEnum {

    IMPL1("processorImpl1"),
    IMPL2("processorImpl2"),
    IMPL3("processorImpl3"),
    IMPL4("processorImpl4");

    private final String className;

    ProcessorIdentityEnum(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}
