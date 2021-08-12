package Exercise_5;

import Exercise_4.InputReader;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) throws Exception {
        try (InputReader inputReader = new InputReader()) {
            //Reading input
            String firstNumber = inputReader.readString("What is the first number?");
            String secondNumber = inputReader.readString("What is the second number?");
            //Logic
            Calculator calculator = new Calculator();
            calculator = new Calculator(firstNumber, secondNumber);
            int sum = calculator.sum();
            int sub = calculator.sub();
            int mult = calculator.mult();
            float div = calculator.div();
            //Output
            System.out.println(firstNumber + " + " + secondNumber + " = " + sum + "\n" +
                    firstNumber + " - " + secondNumber + " = " + sub + "\n" +
                    firstNumber + " * " + secondNumber + " = " + mult + "\n" +
                    firstNumber + " / " + secondNumber + " = " + div);
        }
    }
}
