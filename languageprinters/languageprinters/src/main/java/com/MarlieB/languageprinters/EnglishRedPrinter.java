package com.MarlieB.languageprinters;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter{

    @Bean
    @Override
    public String print() {
        return "red";
    }
}
