package miu.edu.cse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        calculator = null;
    }
    @Test
    void testSumOfTwoIntegers() {
        assertEquals(5, calculator.addTwoIntegers(3, 2));
    }

}