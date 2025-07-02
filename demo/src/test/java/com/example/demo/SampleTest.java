package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SampleTest {
    @Test
    void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    void testStringContains() {
        String message = "Hello, world!";
        assertTrue(message.contains("world"), "Message should contain 'world'");
    }

    @Test
    void testListSize() {
        var list = java.util.List.of("apple", "banana", "cherry");
        assertEquals(3, list.size(), "List should contain 3 elements");
    }

    @Test
    void testExceptionThrown() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        }, "Division by zero should throw ArithmeticException");
    }

}
