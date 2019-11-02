package com.github.jinahya.openrtb.domain.enumeration;

public enum StandardMediaRating implements MediaRating {

    // -----------------------------------------------------------------------------------------------------------------
    ALL_AUDIENCES(CODE_ALL_AUDIENCES),

    EVERYONE_OVER_AGE_12(CODE_EVERYONE_OVER_AGE_12),

    MATURE_AUDIENCES(CODE_MATURE_AUDIENCES);

    // -----------------------------------------------------------------------------------------------------------------
    public static StandardMediaRating valueOfCode(final int code) {
        for (final StandardMediaRating value : values()) {
            if (value.code == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("value for for code: " + code);
    }

    // -----------------------------------------------------------------------------------------------------------------
    StandardMediaRating(final int code) {
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
