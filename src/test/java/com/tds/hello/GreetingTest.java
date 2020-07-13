package com.tds.hello;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest {

    private Greeting greeting;

    @BeforeEach
    public void setUpFixture() {
        greeting = new Greeting( 10, "Hello World" );
    }

    @Test
    public void testGreetingId() {
        assertEquals( 10, greeting.getId() );
    }

    @Test
    public void testGreetingContent() {
        assertEquals( "Hello World", greeting.getContent() );
    }

}
