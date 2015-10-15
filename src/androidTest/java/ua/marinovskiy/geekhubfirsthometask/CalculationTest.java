package ua.marinovskiy.geekhubfirsthometask;

import junit.framework.TestCase;

import ua.marinovskiy.geekhubhometasks.hometask2.Calculation;

public class CalculationTest extends TestCase {

    public void testFactorial() throws Exception {
        assertEquals(1, Calculation.factorial(0));
        assertEquals(1, Calculation.factorial(1));
        assertEquals(6, Calculation.factorial(3));
        assertEquals(120, Calculation.factorial(5));
        assertEquals(39916800, Calculation.factorial(11));
    }

    public void testFibonacci() throws Exception {
        assertEquals(1, Calculation.fibonacci(1));
        assertEquals(1, Calculation.fibonacci(2));
        assertEquals(2, Calculation.fibonacci(3));
        assertEquals(5, Calculation.fibonacci(5));
        assertEquals(13, Calculation.fibonacci(7));
        assertEquals(89, Calculation.fibonacci(11));
    }
}
