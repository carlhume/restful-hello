package com.tds.hello;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GreetingControllerTest {

    private GreetingController controller;

    @BeforeEach
    private void setUpFixture() {
        controller = new GreetingController();
    }

    @Test
    public void testControllerReturnsGreeting() {
        assertNotNull( controller.greeting( "World", "en" ) );
    }

    @Test
    public void testControllerCanGreetCarl() {
        assertTrue( controller.greeting( "Carl", "en" ).getContent().endsWith( "Carl!" ) );
    }

    @Test
    public void testControllerCanGreetInEnglish() {
        assertTrue( controller.greeting( "Carl", "en").getContent().startsWith( "Hello" ) );
    }

    @Test
    public void testControllerCanGreetInFrench() {
        assertTrue( controller.greeting( "Carl", "fr").getContent().startsWith( "Bonjour" ) );
    }

}
