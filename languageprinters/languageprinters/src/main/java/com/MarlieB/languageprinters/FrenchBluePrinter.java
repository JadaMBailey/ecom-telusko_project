package com.MarlieB.languageprinters;

import org.springframework.stereotype.Component;

@Component
public class FrenchBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "blu`e";
    }
}
