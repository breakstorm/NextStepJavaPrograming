package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main calc;

    @BeforeEach
    public void setup() {
        calc = new Main();
    }

    @Test
    void add() {
        assertEquals(9, calc.add(6, 3));
    }

    @Test
    void subtract() {
        assertEquals(3, calc.subtract(6, 3));
    }

    @Test
    void multiply() {
        assertEquals(18, calc.multiply(6, 3));
    }

    @Test
    void divide() {
        assertEquals(2, calc.divide(6, 3));
    }
}