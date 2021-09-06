package com.ssatari;

import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
class HelloWorldControllerTest {

    @Inject
    EmbeddedApplication<?> application;

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }

    @Test
    @DisplayName("Should returns response of /hello")
    void testHelloResponse() {
        String result = client.toBlocking().retrieve("/hello");
        assertEquals("Hello from service", result);
    }
}
