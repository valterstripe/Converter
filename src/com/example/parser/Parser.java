package com.example.parser;

import com.example.model.Rate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Parser {
    private String path;

    public Parser(String path) {
        this.path = path;
    }

    public Rate getRate(String currency) throws IOException {
        Path filePath = Paths.get(path);
        String content = Files.readString(filePath);
        //TODO Jakson получить гсон,  венуть объект типа рейт
        if (currency.equals("USD")) {
            return new Rate("USD", 75D);
        }
        return new Rate("EUR", 90D);
    }
}
