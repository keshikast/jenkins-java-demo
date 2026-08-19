package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testGreeting() {
        assertEquals("Hello, Jenkins Java CI/CD Pipeline!\nPoll SCM trigger jenkins\nshow git update", App.getGreeting());
    }
}
