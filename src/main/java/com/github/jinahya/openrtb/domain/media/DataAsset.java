package com.github.jinahya.openrtb.domain.media;

import com.github.jinahya.openrtb.domain.enumeration.NativeDataAssetType;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

public class DataAsset {

    // -----------------------------------------------------------------------------------------------------------------
    @NotBlank
    private String value;

    private Integer len;

    @Valid
    private NativeDataAssetType type;

    private Object ext;
}
