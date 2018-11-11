package com.leony.test;

import com.leony.home.CalculatorWithStack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorWithStackTest {
    private CalculatorWithStack calculator;

    @Before
    public void beforeEach() {
        calculator = new CalculatorWithStack();
    }

    @Test(expected = Exception.class)
    public void shouldThrowException() throws Exception {
        calculator.calculate("2 + 3 -");
        calculator.calculate("2 +");
    }

    @Test
    public void shouldPerformValidCalculations() throws Exception {
        assertEquals(calculator.calculate("2 + 1"), 3);
        assertEquals(calculator.calculate("4 - 3"), 1);
        assertEquals(calculator.calculate("2 + 3 + 20 - 5"), 20);
    }
}
