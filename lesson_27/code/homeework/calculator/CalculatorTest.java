package homeework.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();

    }

    @Test
    void AddTest() {//- Этот тест проверяет метод add(). Он включает проверки на обычное сложение, сложение нуля и отрицательные числа.
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    void SubtractTest() {//Этот тест проверяет метод subtract().
        // Он включает проверки на обычное вычитание, вычитание нуля и отрицательные числа.
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(0, calculator.subtract(0, 0));
        assertEquals(1, calculator.subtract(-2, -3));
    }

    @Test
    void MultiplyTest() {// Этот тест проверяет метод multiply().
        // Он включает проверки на обычное умножение, умножение на нуль и умножение на отрицательные числа.
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 0));
        assertEquals(-6, calculator.multiply(2, -3));
    }

    @Test
    void DivideTest() {//Этот тест проверяет метод divide().
        // Он включает проверки обычного деления, деления на нуль и обработку исключения IllegalArgumentException, когда попытка деления на ноль.
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(0, calculator.divide(0, 5));

        // Proverka delenija na nol
        try {
            calculator.divide(5, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Dleenie na nol ne dopuskaeetsja.", e.getMessage());
        }
    }

    @Test
    void ModuloTest() {// Этот тест проверяет метод modulo().
        // Он включает проверки вычисления остатка от деления, вычисления остатка от деления на нуль и обработку исключения
        // IllegalArgumentException, если попытка вычисления остатка от деления на ноль.
        assertEquals(2, calculator.modulo(7, 5));
        assertEquals(0, calculator.modulo(10, 5));

        // Proverka delenija na nol
        try {
            calculator.modulo(5, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Dleenie na nol ne dopuskaeetsja.", e.getMessage());
        }

    }

    @Test
    void IntegerDivisionTest() {// Этот тест проверяет метод integerDivision().
        // Он включает проверки целочисленного деления, целочисленного деления на нуль и обработку исключения
        // IllegalArgumentException, если попытка целочисленного деления на ноль.
        assertEquals(2, calculator.integerDivision(7, 3));
        assertEquals(0, calculator.integerDivision(1, 5));
        assertEquals(-2, calculator.integerDivision(-5, 2));

        // Proverka delenija na nol
        try {
            calculator.integerDivision(5, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Dleenie na nol ne dopuskaeetsja.", e.getMessage());
        }
    }
}
