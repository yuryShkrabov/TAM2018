package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double firstNumber = 0;
        double secondNumber = 0;
        char operationType;
        Calculator calculator = new Calculator();

        try {
            System.out.println("Enter first number:");
            firstNumber = scanner.nextDouble();
            System.out.println("Enter second number:");
            secondNumber = scanner.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("Invalid data type was entered");
            e.printStackTrace();
        }
        do {

            System.out.println("Select operation: +, -, / or *");
            operationType = scanner.next().charAt(0);

            switch (operationType) {
                case '+': {
                    calculator.addition(firstNumber, secondNumber);
                    System.out.println(firstNumber + " + " + secondNumber + " = " + calculator.getResult());
                    break;
                }
                case '-': {
                    calculator.subtraction(firstNumber, secondNumber);
                    System.out.println(firstNumber + " - " + secondNumber + " = " + calculator.getResult());
                    break;
                }
                case '/': {
                    calculator.division(firstNumber, secondNumber);
                    System.out.println(firstNumber + " / " + secondNumber + " = " + calculator.getResult());
                    break;
                }
                case '*': {
                    calculator.multiplication(firstNumber, secondNumber);
                    System.out.println(firstNumber + " * " + secondNumber + " = " + calculator.getResult());
                    break;
                }
                default: {
                    try {
                        throw new Exception("Invalid operation type");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        while (operationType != '+' || operationType != '-' || operationType != '/' || operationType != '*');
    }
}
