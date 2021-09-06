package com.ssatari.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloWorldController {

    @Get("/")
    public String index() {
        return "Hello From Micronaut ;)";
    }
}
