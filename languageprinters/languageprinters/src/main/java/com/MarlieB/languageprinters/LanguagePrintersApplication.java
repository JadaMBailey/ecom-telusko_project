package com.MarlieB.languageprinters;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


@SpringBootApplication
// Spring-Boot-Application includes Component Scan annotation which will scan within the package [Ln1] and subdirectories
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
/*
@Component = to the PrinterConfig class where we stored the @Bean methods creating objects of required classes
Example
@Bean
public RedPrinter redPrinter(){
return new FrenchRedPrinter;
}
 */