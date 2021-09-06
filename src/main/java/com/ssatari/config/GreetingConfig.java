package com.ssatari.config;

import io.micronaut.context.annotation.ConfigurationInject;
import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@ConfigurationProperties("hello.config.greeting")
@Getter
public class GreetingConfig {

    private final String en;
    private final String per;
    private final String de;

    @ConfigurationInject
    public GreetingConfig(@NotBlank String en, @NotBlank String per, @NotBlank String de) {
        this.en = en;
        this.per = per;
        this.de = de;
    }
}
