package com.github.jinahya.openrtb.domain;

public enum PredefinedAuditStatus implements AuditStatusCode {

    // -----------------------------------------------------------------------------------------------------------------
    PENDING_AUDIT(1),

    PRE_APPROVED(2),

    APPROVED(3),

    DINIED(4),

    CHANGED(5),

    EXPIRED(6);

    // -----------------------------------------------------------------------------------------------------------------
    PredefinedAuditStatus(final int code) {
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
