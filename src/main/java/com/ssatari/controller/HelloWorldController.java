package com.ssatari.controller;

import com.ssatari.service.HelloWorldService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.AllArgsConstructor;

@Controller("${hello.controller.path}")
@AllArgsConstructor
public class HelloWorldController {

    private final HelloWorldService service;

    @Get
    public String index() {
        return service.sayHi();
    }
}
