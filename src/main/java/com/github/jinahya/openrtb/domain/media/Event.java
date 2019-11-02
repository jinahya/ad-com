package com.github.jinahya.openrtb.domain.media;

import com.github.jinahya.openrtb.domain.enumeration.ApiFramework;
import com.github.jinahya.openrtb.domain.enumeration.EventTrackingMethod;
import com.github.jinahya.openrtb.domain.enumeration.EventType;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

public class Event {

    // -----------------------------------------------------------------------------------------------------------------
    @Valid
    private EventType type;

    @Valid
    @NotNull
    private EventTrackingMethod method;

    private List<@Valid @NotNull ApiFramework> api;

    private String url;

    private Map<Object, Object> cdata;

    private Object ext;
}
