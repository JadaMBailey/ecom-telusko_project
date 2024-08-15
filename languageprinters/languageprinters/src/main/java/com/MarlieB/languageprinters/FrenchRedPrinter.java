package com.MarlieB.languageprinters;

import org.springframework.stereotype.Component;

@Component
public class FrenchRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "rouge";
    }
}

