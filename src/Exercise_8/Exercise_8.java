package Exercise_8;

import Exercise_4.InputReader;

import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args) throws Exception {
        try (InputReader inputReader = new InputReader()) {
            //Reading input
            String people = inputReader.readString("How many people?");
            String pizzas = inputReader.readString("How many pizzas do you have?");
            //Logic
            PizzasCalc pizzasCalc = new PizzasCalc(people,pizzas);
            String res = pizzasCalc.calculate();
            //Output
            System.out.println(res);
        }
    }
}
