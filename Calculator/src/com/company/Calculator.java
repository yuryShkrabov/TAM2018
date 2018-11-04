package com.company;

public class Calculator {

    private double result;

    public double addition(double firstNumber, double secondNumber) {
        return result = firstNumber + secondNumber;
    }

    public double subtraction(double firstNumber, double secondNumber) {
        return result = firstNumber - secondNumber;
    }

    public double division(double firstNumber, double secondNumber) {
        if (secondNumber != 0) {
            return result = firstNumber / secondNumber;
        } else {
            throw new IllegalArgumentException("Division by zero");
        }
    }

    public double multiplication(double firstNumber, double secondNumber) {
        return result = firstNumber * secondNumber;
    }

    public double getResult() {
        return result;
    }
}
