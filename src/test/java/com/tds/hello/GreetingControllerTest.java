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
        assertNotNull( controller.greeting( "World" ) );
    }

    @Test
    public void testControllerCanGreetCarl() {
        assertTrue( controller.greeting( "Carl" ).getContent().endsWith( "Carl!" ) );
    }

}
