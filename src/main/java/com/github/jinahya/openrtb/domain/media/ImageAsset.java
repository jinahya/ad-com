package com.github.jinahya.openrtb.domain.media;

import com.github.jinahya.openrtb.domain.enumeration.NativeImageAssetType;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

public class ImageAsset {

    @NotBlank
    private String url;

    private Integer w;

    private Integer h;

    @Valid
    private NativeImageAssetType type;

    private Object ext;
}
