package com.github.jinahya.openrtb.domain.media;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

public class Native {

    // -----------------------------------------------------------------------------------------------------------------
    @Valid
    private LinkAsset link;

    @NotNull
    private List<@Valid @NotNull Asset> asset;

    @Valid
    private Object ext;
}
