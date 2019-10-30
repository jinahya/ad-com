package com.github.jinahya.openrtb.domain;

public enum PredefinedCategoryTaxonomy implements CategoryTaxonomyCode {

    // -----------------------------------------------------------------------------------------------------------------
    IAB_CONTENT_CATEGORY_TAXONOMY_1_0(1),

    IAB_CONTENT_CATEGORY_TAXONOMY_2_0(2),

    IAB_AD_PRODUCT_TAXONOMY_1_0(3);

    // -----------------------------------------------------------------------------------------------------------------
    PredefinedCategoryTaxonomy(final int code) {
        this.code = code;
    }

    // -----------------------------------------------------------------------------------------------------------------
    @Override
    public int getCode() {
        return code;
    }

    // -----------------------------------------------------------------------------------------------------------------
    private final int code;
}
