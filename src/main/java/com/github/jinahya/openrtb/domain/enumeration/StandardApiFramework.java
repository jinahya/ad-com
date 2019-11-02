package com.github.jinahya.openrtb.domain.enumeration;

public enum StandardApiFramework implements ApiFramework {

    // -----------------------------------------------------------------------------------------------------------------
    VPAID_1_0(CODE_VPAID_1_0),

    VPAID_2_0(CODE_VPAID_2_0),

    MRAID_1_0(CODE_MRAID_1_0),

    ORMMA(CODE_ORMMA),

    MRAID_2_0(CODE_MRAID_2_0),

    MRAIN_3_0(CODE_MRAIN_3_0),

    OMID_1_0(CODE_OMID_1_0);

    // -----------------------------------------------------------------------------------------------------------------
    StandardApiFramework(final int code) {
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
