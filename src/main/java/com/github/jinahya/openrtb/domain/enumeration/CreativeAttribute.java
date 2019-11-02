package com.github.jinahya.openrtb.domain.enumeration;

public interface CreativeAttribute extends CodeEnum {

    // -----------------------------------------------------------------------------------------------------------------
    int CODE_AUDIO_AD_AUTOPLAY = 1;

    int CODE_AUDIO_AD_USER_INITIATED = 2;

    int CODE_EXPANDABLE_AUTOMATIC = 3;

    int CODE_EXPANDABLE_USER_INITIATED_CLICK = 4;

    int CODE_EXPANDABLE_USER_INITIATED_ROLLOVER = 5;

    int CODE_IN_BANNER_VIDEO_AD_AUTOPLAY = 6;

    int CODE_IN_BANNER_VIDEO_AD_USER_INITIATED = 6;

    int CODE_POP = 8;

    int CODE_PROVOCATIVE_OR_SUGGESTIVE_IMAGERY = 9;

    int CODE_SHAKY_FLASHING_FLICKERING_EXTREME = 10;

    int CODE_SURVEYS = 11;

    int CODE_TEXT_ONLY = 12;

    int CODE_USER_INTERACTIVE = 13;

    int CODE_WINDOWS_DIALOG_OR_ALERT_STYLE = 14;

    int CODE_HAS_AUDIO_ON_OFF_BUTTON = 15;

    int CODE_ADS_PROVIDE_SKIP_BUTTON = 16;

    int CODE_ADOBE_FLASH = 17;

    int CODE_RESPONSIVE_SIZELESS_FLUID = 18;

    // -----------------------------------------------------------------------------------------------------------------
    int MIN_CODE_VENDOR_SPECIFIC = 500;
}
