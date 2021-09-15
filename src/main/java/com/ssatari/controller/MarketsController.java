package com.ssatari.controller;

import com.ssatari.data.Symbol;
import com.ssatari.store.InMemoryStore;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.AllArgsConstructor;

import java.util.List;

@Controller("/markets")
@AllArgsConstructor
public class MarketsController {

    private final InMemoryStore store;

    @Get("/")
    public List<Symbol> all() {
        return store.getAllSymbols();
    }

}
