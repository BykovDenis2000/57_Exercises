package Exercise_2;

import Exercise_4.InputReader;

public class Exercise_2 {
    public static void main(String[] args) throws Exception {
        try (InputReader inputReader = new InputReader()) {
            //Reading input
            String str = inputReader.readString("What is the input string?");
            //Logic
            CharCalc charCalc = new CharCalc(str);
            int count = charCalc.calculate();
            //Output
            System.out.println(str + " has " + count + " characters");
        }
    }
}
