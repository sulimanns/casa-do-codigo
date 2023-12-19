package com.casadocodigo.casadocodigo.useCases.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casadocodigo.casadocodigo.useCases.consul.ApplicationConfigConsul;
import com.casadocodigo.casadocodigo.utils.URI;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class InitController {

    private final ApplicationConfigConsul properties;

    @GetMapping(value = URI.INIT)
    public ResponseEntity<Object> init(){
        return ResponseEntity.status(HttpStatus.OK).body(new User(properties.getMsg(), properties.getAppProfile(), properties.getClientId(), properties.getClientSecret(), properties.getJwtSecret(), properties.getJwtDuration(), properties.getCorsOrigins()));
    }
    
}
