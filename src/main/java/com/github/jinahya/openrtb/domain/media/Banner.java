package com.github.jinahya.openrtb.domain.media;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

public class Banner {

    // -----------------------------------------------------------------------------------------------------------------
    @NotBlank
    private String img;

    @Valid
    private LinkAsset link;

    private Object ext;
}
