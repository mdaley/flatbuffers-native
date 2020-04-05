package com.something;

import static com.something.FirstClass.increment;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FirstClassTest {
    @Test
    void test_one() {
        assertEquals(2, increment(1));
    }
}
