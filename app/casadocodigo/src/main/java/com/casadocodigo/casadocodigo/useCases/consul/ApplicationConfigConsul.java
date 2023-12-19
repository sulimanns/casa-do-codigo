package com.casadocodigo.casadocodigo.useCases.consul;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties("app-config-consul")
public class ApplicationConfigConsul {

    private String msg;
    private String appProfile;
    private String clientId;
    private String clientSecret;
    private String jwtSecret;
    private String jwtDuration;
    private String corsOrigins;
    
}
