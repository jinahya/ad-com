package com.github.jinahya.openrtb.domain.media;

import com.github.jinahya.openrtb.domain.enumeration.AuditStatusCode;

import javax.validation.constraints.NotBlank;
import java.util.List;

public class Audit {

    private AuditStatusCode status;

    private List<@NotBlank String> feedback;

    private Long init;

    private Long lastmod;

    private Object corr;

    private Object ext;
}
