package com.github.jinahya.openrtb.domain;

public enum PredefinedCompanionType implements CompanionCode {

    // -----------------------------------------------------------------------------------------------------------------
    STATIC(1),

    HTML(2),

    IFRAME(3);

    // -----------------------------------------------------------------------------------------------------------------
    PredefinedCompanionType(final int code) {
        this.code = code;
    }

    // -----------------------------------------------------------------------------------------------------------------
    @Override
    public int getCode() {
        return code;
    }

    // -----------------------------------------------------------------------------------------------------------------
    private final int code;
}