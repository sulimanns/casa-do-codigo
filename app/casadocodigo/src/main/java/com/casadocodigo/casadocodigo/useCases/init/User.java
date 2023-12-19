package com.casadocodigo.casadocodigo.useCases.init;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String msg;
    private String appProfile;
    private String clientId;
    private String clientSecret;
    private String jwtSecret;
    private String jwtDuration;
    private String corsOrigins;
    
}
