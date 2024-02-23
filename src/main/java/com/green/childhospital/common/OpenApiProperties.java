package com.green.childhospital.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@ConfigurationProperties(prefix = "openapi")
public class OpenApiProperties {

    private final ChildHospital childHospital = new ChildHospital();

    @Getter
    @Setter
    public static class ChildHospital {
        private String baseUrl;
        private String dataUrl;
        private String serviceKey;
    }
}
