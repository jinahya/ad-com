package com.github.jinahya.openrtb.domain.media;

import com.github.jinahya.openrtb.domain.enumeration.CategoryTaxonomyCode;
import com.github.jinahya.openrtb.domain.enumeration.CreativeAttribute;
import com.github.jinahya.openrtb.domain.enumeration.MediaRatingAdapter;
import com.github.jinahya.openrtb.domain.enumeration.StandardMediaRating;

import javax.json.bind.annotation.JsonbTypeAdapter;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import static java.util.Optional.ofNullable;

public class Ad {

    // -----------------------------------------------------------------------------------------------------------------
    public static final int SECURE_NO = 0;

    public static final int SECURE_YES = 1;

    // ------------------------------------------------------------------------------------------------------------ init
    public Long getInit() {
        return init;
    }

    public void setInit(final Long init) {
        this.init = init;
    }

    public Date getInitAsDate() {
        return ofNullable(getInit()).map(Date::new).orElse(null);
    }

    public void setInitAsDate(final Date initAsDate) {
        setInit(ofNullable(initAsDate).map(Date::getTime).orElse(null));
    }

    public Instant getInitAsInstant() {
        return ofNullable(getInitAsDate()).map(Date::toInstant).orElse(null);
    }

    public void setInitAsInstant(final Instant initAsInstant) {
        setInitAsDate(ofNullable(initAsInstant).map(Date::from).orElse(null));
    }

    // -----------------------------------------------------------------------------------------------------------------
    public Long getLastmod() {
        return lastmod;
    }

    public void setLastmod(Long lastmod) {
        this.lastmod = lastmod;
    }

    public Date getLastmodAsDate() {
        return ofNullable(getLastmod()).map(Date::new).orElse(null);
    }

    public void setLastmodAsDate(final Date lastmodAsDate) {
        setLastmod(ofNullable(lastmodAsDate).map(Date::getTime).orElse(null));
    }

    public Instant getLastmodAsInstant() {
        return ofNullable(getLastmodAsDate()).map(Date::toInstant).orElse(null);
    }

    public void setLastmodAsInstant(final Instant lastmodAsInstant) {
        setLastmodAsDate(ofNullable(lastmodAsInstant).map(Date::from).orElse(null));
    }

    // -----------------------------------------------------------------------------------------------------------------
    @NotBlank
    private String id;

    @NotNull
    private List<@NotBlank String> adomain;

    @NotNull
    private List<@NotBlank String> bundle;

    private String iurl;

    private List<@NotBlank String> cat;

    private int cattax = CategoryTaxonomyCode.CODE_IAB_CONTENT_CATEGORY_TAXONOMY_2_0;

    private String lang;

    @NotNull
    private List<@NotNull @Valid CreativeAttribute> attr;

    private Integer secure;

    @JsonbTypeAdapter(MediaRatingAdapter.class)
    private StandardMediaRating mrating;

    private Long init;

    private Long lastmod;

    @Valid
    private Display display;

    @Valid
    private Video video;

    @Valid
    private Audio audio;

    @Valid
    private Audit audit;

    @Valid
    private Object ext;
}
