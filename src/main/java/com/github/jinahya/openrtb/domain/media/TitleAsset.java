package com.github.jinahya.openrtb.domain.media;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;

import static java.util.Optional.ofNullable;

public class TitleAsset {

    // -----------------------------------------------------------------------------------------------------------------
    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
        setLen(ofNullable(getText()).map(String::length).orElse(0));
    }

    // -----------------------------------------------------------------------------------------------------------------
    public int getLen() {
        return len;
    }

    public void setLen(final int len) {
        this.len = len;
    }

    // -----------------------------------------------------------------------------------------------------------------
    public Object getExt() {
        return ext;
    }

    public void setExt(final Object ext) {
        this.ext = ext;
    }

    // -----------------------------------------------------------------------------------------------------------------
    @NotEmpty
    private String text;

    @PositiveOrZero
    private int len;

    @Valid
    private Object ext;
}
