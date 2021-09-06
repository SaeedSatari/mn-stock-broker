package com.ssatari.controller;

import com.ssatari.config.GreetingConfig;
import com.ssatari.service.HelloWorldService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.AllArgsConstructor;

@Controller("${hello.controller.path}")
@AllArgsConstructor
public class HelloWorldController {

    private final HelloWorldService service;
    private final GreetingConfig config;

    @Get
    public String index() {
        return service.sayHi();
    }

    @Get("/en")
    public String greetingInEnglish() {
        return config.getEn();
    }

    @Get("/per")
    public String greetingInPersian() {
        return config.getPer();
    }

    @Get("/de")
    public String greetingInGerman() {
        return config.getDe();
    }
}
