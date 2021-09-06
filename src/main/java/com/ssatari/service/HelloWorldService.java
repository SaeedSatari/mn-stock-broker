package com.ssatari.service;

import io.micronaut.context.annotation.Value;
import jakarta.inject.Singleton;

@Singleton
public class HelloWorldService {

    @Value("${hello.service.greeting}")
    private String greeting;

    public String sayHi() {
        return greeting;
    }
}
