package com.MarlieB.languageprinters;

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
