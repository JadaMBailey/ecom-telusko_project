package com.MarlieB.languageprinters;

import org.springframework.stereotype.Component;

@Component
// This annotation states 'I am Bean', amy dependencies in this constructor should be injected as well
public class ColourPrinterImp implements ColourPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;


    public ColourPrinterImp(RedPrinter redPrinter, BluePrinter bluePrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print());
        // search what the 'join' method does

    }
}
