package com.github.jinahya.openrtb.domain.media;

import com.github.jinahya.openrtb.domain.enumeration.ApiFramework;
import com.github.jinahya.openrtb.domain.enumeration.CreativeSubtypeAudioVideo;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;
import java.util.Set;

public class Video {

    private Set<@NotBlank String> mime;

    private List<@Valid @NotNull ApiFramework> api;

    private CreativeSubtypeAudioVideo ctype;

    @PositiveOrZero
    private Integer dur;

    private String adm;

    private String curl;

    private Object ext;
}
