package com.sviryd.egr.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "egr")
public class EgrConfig {
    private String addressAndDateURL;
    private String fullNameAndStatusURL;
}
