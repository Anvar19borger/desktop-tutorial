package homeework.calculator;

public class Calculator {

    public int add(int a, int b) { // Этот метод выполняет сложение двух целых чисел a и b и возвращает результат.
        return a + b;
    }

    public int subtract(int a, int b) { //Этот метод выполняет вычитание числа b из числа a и возвращает результат.
        return a - b;
    }

    public int multiply(int a, int b) {//Этот метод выполняет умножение двух целых чисел a и b и возвращает результат.
        return a * b;
    }

    public int divide(int a, int b) {//Этот метод выполняет деление числа a на число b и возвращает результат.
        // Если b равно нулю, метод бросает исключение IllegalArgumentException, поскольку деление на ноль недопустимо.
        if (b == 0) {
            throw new IllegalArgumentException("Dleenie na nol ne dopuskaeetsja.");
        }
        return a / b;
    }

    public int modulo(int a, int b) {//Этот метод вычисляет остаток от деления числа a на число b и возвращает результат.
        // Также, если b равно нулю, метод бросает исключение IllegalArgumentException.
        if (b == 0) {
            throw new IllegalArgumentException("Dleenie na nol ne dopuskaeetsja.");
        }
        return a % b;
    }

    public int integerDivision(int a, int b) {// Этот метод выполняет целочисленное деление числа a на число b и возвращает результат.
        // Как и в предыдущих методах, если b равно нулю, бросается исключение IllegalArgumentException.
        if (b == 0) {
            throw new IllegalArgumentException("Dleenie na nol ne dopuskaeetsja.");
        }
        return a / b;
    }
}
