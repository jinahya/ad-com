package com.github.jinahya.openrtb.domain.media;

import com.github.jinahya.openrtb.domain.enumeration.CodeEnum;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Asset {

    // -----------------------------------------------------------------------------------------------------------------
    public enum Req implements CodeEnum {

        // -----------------------------------------------------------------------------------------------------------------
        NO(0),

        YES(1);

        // -----------------------------------------------------------------------------------------------------------------
        Req(final int code) {
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

    // -----------------------------------------------------------------------------------------------------------------
    private Integer id;

    @Valid
    @NotNull
    private Req req = Req.NO;

    @Valid
    private TitleAsset title;

    @Valid
    private ImageAsset image;

    @Valid
    private VideoAsset video;

    @Valid
    private DataAsset data;

    @Valid
    private LinkAsset link;

    @Valid
    private Object ext;
}
