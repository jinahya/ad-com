package com.github.jinahya.openrtb.domain.enumeration;

public enum StandardCreateAttribute implements CreativeAttribute {

    AUDIO_AD_AUTOPLAY(CODE_AUDIO_AD_AUTOPLAY),

    AUDIO_AD_USER_INITIATED(CODE_AUDIO_AD_USER_INITIATED),

    EXPANDABLE_AUTOMATIC(CODE_EXPANDABLE_AUTOMATIC),

    EXPANDABLE_USER_INITIATED_CLICK(CODE_EXPANDABLE_USER_INITIATED_CLICK),

    EXPANDABLE_USER_INITIATED_ROLLOVER(CODE_EXPANDABLE_USER_INITIATED_ROLLOVER),

    IN_BANNER_VIDEO_AD_AUTOPLAY(CODE_IN_BANNER_VIDEO_AD_AUTOPLAY),

    IN_BANNER_VIDEO_AD_USER_INITIATED(CODE_IN_BANNER_VIDEO_AD_USER_INITIATED),

    POP(CODE_POP),

    PROVOCATIVE_OR_SUGGESTIVE_IMAGERY(CODE_PROVOCATIVE_OR_SUGGESTIVE_IMAGERY),

    SHAKY_FLASHING_FLICKERING_EXTREME(CODE_SHAKY_FLASHING_FLICKERING_EXTREME),

    SURVEYS(CODE_SURVEYS),

    TEXT_ONLY(CODE_TEXT_ONLY),

    USER_INTERACTIVE(CODE_USER_INTERACTIVE),

    WINDOWS_DIALOG_OR_ALERT_STYLE(CODE_WINDOWS_DIALOG_OR_ALERT_STYLE),

    HAS_AUDIO_ON_OFF_BUTTON(CODE_HAS_AUDIO_ON_OFF_BUTTON),

    ADS_PROVIDE_SKIP_BUTTON(CODE_ADS_PROVIDE_SKIP_BUTTON),

    ADOBE_FLASH(CODE_ADOBE_FLASH),

    RESPONSIVE_SIZELESS_FLUID(CODE_RESPONSIVE_SIZELESS_FLUID);

    // -----------------------------------------------------------------------------------------------------------------
    StandardCreateAttribute(final int code) {
        this.code = code;
    }

    // -----------------------------------------------------------------------------------------------------------------
    @Override
    public int getCode() {
        return code;
    }

    private final int code;
}
