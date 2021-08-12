package Exercise_6;

import Exercise_4.InputReader;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) throws Exception {
        try (InputReader inputReader = new InputReader()) {
            //Reading input
            String currentAge = inputReader.readString("What is your current age?");
            String retireAge = inputReader.readString("At what age would you like to retire?");
            //Logic
            RetireCalc retireCalc = new RetireCalc(currentAge,retireAge);
            String res = retireCalc.retireCalc();
            //Output
            System.out.println(res);
        }
    }
}
