package com.github.jinahya.openrtb.domain.enumeration;

public enum StandardCreativeSubtypeAudioVideo implements CreativeSubtypeAudioVideo {

    // -----------------------------------------------------------------------------------------------------------------
    VAST_1_0(CODE_VAST_1_0),

    VAST_2_0(CODE_VAST_2_0),

    VAST_3_0(CODE_VAST_3_0),

    VAST_1_0_WRAPPER(CODE_VAST_1_0_WRAPPER),

    VAST_2_0_WRAPPER(CODE_VAST_2_0_WRAPPER),

    VAST_3_0_WRAPPER(CODE_VAST_3_0_WRAPPER),

    VAST_4_0(CODE_VAST_4_0),

    VAST_4_0_WRAPPER(CODE_VAST_4_0_WRAPPER),

    DAAST_1_0(CODE_DAAST_1_0),

    DAAST_1_0_WRAPPER(CODE_DAAST_1_0_WRAPPER),

    VAST_4_1(CODE_VAST_4_1),

    VAST_4_1_WRAPPER(CODE_VAST_4_1_WRAPPER);

    // -----------------------------------------------------------------------------------------------------------------
    public static StandardCreativeSubtypeAudioVideo valueOfCode(final int code) {
        for (final StandardCreativeSubtypeAudioVideo value : values()) {
            if (value.code == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("value for for code: " + code);
    }

    // -----------------------------------------------------------------------------------------------------------------
    StandardCreativeSubtypeAudioVideo(final int code) {
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
