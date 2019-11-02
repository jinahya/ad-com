package com.github.jinahya.openrtb.domain.placement;

import com.github.jinahya.openrtb.domain.enumeration.CodeEnum;
import com.github.jinahya.openrtb.domain.enumeration.CodeEnumAdapter;

import javax.json.bind.annotation.JsonbTypeAdapter;
import javax.validation.Valid;

public class Companion {

    // -----------------------------------------------------------------------------------------------------------------
    public static final int VCM_CONCURRENT = 0;

    public static final int VCM_END_CARD = 1;

    public enum Vcm implements CodeEnum {

        // --------------------------------------------------------------------------------------------------------------
        CONCURRENT(VCM_CONCURRENT),

        END_CARD(VCM_END_CARD);

        // -----------------------------------------------------------------------------------------------------------------
        public static Vcm valueOfCode(final int code) {
            for (final Vcm value : values()) {
                if (value.code == code) {
                    return value;
                }
            }
            throw new IllegalArgumentException("no value for code: " + code);
        }

        // -------------------------------------------------------------------------------------------------------------
        Vcm(final int code) {
            this.code = code;
        }

        // -------------------------------------------------------------------------------------------------------------
        @Override
        public int getCode() {
            return code;
        }

        // -----------------------------------------------------------------------------------------------------------------
        private final int code;
    }

    public static class VcmAdapter extends CodeEnumAdapter<Vcm> {

        public VcmAdapter() {
            super(Vcm.class);
        }
    }

    // -----------------------------------------------------------------------------------------------------------------

    private String id;

    @JsonbTypeAdapter(VcmAdapter.class)
    @Valid
    private Vcm vcm;

    @Valid
    private DisplayPlacement display;

    private Object ext;
}
