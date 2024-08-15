package com.MarlieB.languageprinters;

import org.springframework.context.annotation.Bean;

public class EnglishRedPrinter implements RedPrinter{

    @Bean
    @Override
    public String print() {
        return "red";
    }
}
