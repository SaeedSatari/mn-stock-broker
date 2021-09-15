package com.ssatari;

import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@MicronautTest
class MarketsControllerTest {

    @Inject
    EmbeddedApplication<?> application;

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    void returnsListOfMarkets() {
        final List<LinkedHashMap<String, String>> results = client.toBlocking().retrieve("/markets", List.class);
        Assertions.assertEquals(3, results.size());
        assertThat(results)
                .extracting(entry -> entry.get("value"))
                .containsExactlyInAnyOrder("AAPL", "NFLX", "GOOG");
    }
}
