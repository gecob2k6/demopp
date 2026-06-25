package com.example.demopp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(5, service.add(2,3));
    }

    @Test
    void testMultiply(){
        assertEquals(12, service.multiply(3,4));
    }

    @Test
    void testDivide(){
        assertEquals(0, service.divide(10, 0));
    }
}
