package com.muj.ci;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, c.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, c.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, c.multiply(2, 3));
    }
}
