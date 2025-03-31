package by.rymtsou;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(4, Calculator.add(2, 2));
        assertEquals(-5, Calculator.add(-3, -2));
        Assertions.assertNotEquals(1, Calculator.add(-2, 2));
    }

    @Test
    void subtract() {
        assertEquals(2, Calculator.subtract(4, 2));
        assertEquals(-3, Calculator.subtract(-5, -2));
        Assertions.assertNotEquals(4, Calculator.add(-2, 2));
    }

    @Test
    void multiply() {
        assertEquals(0, Calculator.multiply(4, 0));
        assertEquals(-4, Calculator.multiply(-2, 2));
        assertEquals(6, Calculator.multiply(-2, -3));
    }

    @Test
    void divide() {
        assertEquals(-2.5, Calculator.divide(-5, 2));
        assertEquals(0.5, Calculator.divide(-2, -4));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0));
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}