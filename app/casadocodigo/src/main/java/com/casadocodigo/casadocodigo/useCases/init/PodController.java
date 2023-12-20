package com.casadocodigo.casadocodigo.useCases.init;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PodController {

    @Value("${HOSTNAME}")
    private String podName;

    @GetMapping("/pod")
    public Object getPod() {
        return podName;
    }
    
    
}
