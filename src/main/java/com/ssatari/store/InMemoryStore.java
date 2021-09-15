package com.ssatari.store;

import com.ssatari.data.Symbol;
import jakarta.inject.Singleton;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Singleton
@AllArgsConstructor
public class InMemoryStore {

    private List<Symbol> symbols;

    public List<Symbol> getAllSymbols() {
        symbols = Stream.of("AAPL", "NFLX", "GOOG")
                .map(Symbol::new)
                .collect(Collectors.toList());
        return symbols;
    }
}
