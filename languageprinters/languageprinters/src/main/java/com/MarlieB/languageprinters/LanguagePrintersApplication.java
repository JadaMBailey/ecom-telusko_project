package com.MarlieB.languageprinters;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


@SpringBootApplication

public class LanguagePrintersApplication implements CommandLineRunner {

	private ColourPrinter colourPrinter;

	public static void main(String[] args) {
		SpringApplication.run(LanguagePrintersApplication.class, args);
	}


	@Override
	public void run(String... args)  {
		colourPrinter.print(); // linked to @Log
		// not sure where 'log' comes from
 	}
}
