package com.github.jinahya.openrtb.domain.enumeration;

public enum StandardCreativeSubtypeDisplay implements CreativeSubtypeDisplay {

    // -----------------------------------------------------------------------------------------------------------------
    HTML(CODE_HTML),

    AMPHTML(CODE_AMPHTML),

    STRUCTURED_IMAGE_OBJECT(CODE_STRUCTURED_IMAGE_OBJECT),

    STRUCTURED_NATIVE_OBJECT(CODE_STRUCTURED_NATIVE_OBJECT);

    // -----------------------------------------------------------------------------------------------------------------
    public static StandardCreativeSubtypeDisplay valueOfCode(final int code) {
        for (final StandardCreativeSubtypeDisplay value : values()) {
            if (value.code == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("value for for code: " + code);
    }

    // -----------------------------------------------------------------------------------------------------------------
    StandardCreativeSubtypeDisplay(final int code) {
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
