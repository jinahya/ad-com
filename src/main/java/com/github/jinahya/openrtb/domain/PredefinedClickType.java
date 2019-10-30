package com.github.jinahya.openrtb.domain;

public enum PredefinedClickType implements ClickTypeCode {

    // -----------------------------------------------------------------------------------------------------------------
    NON_CLICKABLE(1),

    CLICKABLE_UNKNOWN(2),

    CLICKABLE_EMBEDDED(3),

    CLICKABLE_NATIVE(3);

    // -----------------------------------------------------------------------------------------------------------------
    PredefinedClickType(final int code) {
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
