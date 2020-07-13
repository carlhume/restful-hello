package com.tds.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String ISO_639_ENGLISH = "en";
    private static final String ISO_639_FRENCH = "fr";
    private static final String ENGLISH_TEMPLATE = "Hello, %s!";
    private static final String FRENCH_TEMPLATE = "Bonjour, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping( "/greeting" )
    public Greeting greeting( @RequestParam( value = "name", defaultValue = "World" ) String name,
                              @RequestParam( value = "languageCode", defaultValue = ISO_639_ENGLISH ) String languageCode ) {
        String template = chooseTemplate( languageCode );
        return new Greeting( counter.incrementAndGet(), String.format( template, name ) );
    }

    private String chooseTemplate( String languageCode ) {
        String template = ENGLISH_TEMPLATE;
        if( ISO_639_FRENCH.equalsIgnoreCase( languageCode ) ) {
            template = FRENCH_TEMPLATE;
        }
        return template;
    }
}
