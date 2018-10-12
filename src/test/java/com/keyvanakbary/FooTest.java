package com.keyvanakbary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {
    @Test
    void itTestsSomething() {
        Foo foo = new Foo();

        String something = foo.getSomething();

        assertEquals("Something", something);
    }
}