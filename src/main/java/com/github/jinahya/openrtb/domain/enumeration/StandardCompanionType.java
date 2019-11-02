package com.github.jinahya.openrtb.domain.enumeration;

public enum StandardCompanionType implements CompanionType {

    // -----------------------------------------------------------------------------------------------------------------
    STATIC(CODE_STATIC),

    HTML(CODE_HTML),

    IFRAME(CODE_IFRAME);

    // -----------------------------------------------------------------------------------------------------------------
    public static StandardCompanionType valueOfCode(final int code) {
        for (final StandardCompanionType value : values()) {
            if (value.code == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("value for for code: " + code);
    }

    // -----------------------------------------------------------------------------------------------------------------
    StandardCompanionType(final int code) {
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
