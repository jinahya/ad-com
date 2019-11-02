package com.github.jinahya.openrtb.domain.media;

import com.github.jinahya.openrtb.domain.enumeration.ApiFramework;
import com.github.jinahya.openrtb.domain.enumeration.StandardCreativeSubtypeDisplay;

import javax.json.bind.annotation.JsonbProperty;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;

public class Display {

    // -----------------------------------------------------------------------------------------------------------------
    @Size(min = 1)
    private String mime;

    @NotNull
    private List<@Valid @NotNull ApiFramework> api;

    @Valid
    private StandardCreativeSubtypeDisplay ctype;

    @Positive
    private Integer w;

    @Positive
    private Integer h;

    @Positive
    private BigDecimal wratio;

    @Positive
    private BigDecimal hratio;

    @Size(min = 1)
    private String priv;

    private String adm;

    private String curl;

    @Valid
    private Banner banner;

    @JsonbProperty("native")
    @Valid
    private Native native_;

    @Valid
    private Event event;

    @Valid
    private Object ext;
}
