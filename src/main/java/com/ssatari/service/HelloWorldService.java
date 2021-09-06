package com.ssatari.service;

import jakarta.inject.Singleton;

@Singleton
public class HelloWorldService {

    public String sayHi() {
        return "Hi, this is from service";
    }
}
