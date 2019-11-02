package com.github.jinahya.openrtb.domain.media;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;

public class LinkAsset {

    // -----------------------------------------------------------------------------------------------------------------
    @NotBlank
    private String url;

    private String urlfb;

    private List<@NotBlank String> trkr;

    @Valid
    private Object ext;
}
