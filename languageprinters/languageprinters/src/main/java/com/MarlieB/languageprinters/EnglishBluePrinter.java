package com.MarlieB.languageprinters;

import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements BluePrinter {
    @Override
    public String print() {
        return "blue";
    }
}
