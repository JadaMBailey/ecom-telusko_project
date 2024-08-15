package com.MarlieB.languageprinters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// This annotation tells Spring to look for Beans in this file needed to be created
public class PrinterConfig {
    @Bean
    public RedPrinter redPrinter(){
        return new EnglishRedPrinter();
    }

    @Bean
    public BluePrinter bluePrinter(){
        return new EnglishBluePrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(RedPrinter redPrinter,BluePrinter bluePrinter ){
        return new ColourPrinterImp(redPrinter,bluePrinter);
    }

}
