package Exercise_7;

import Exercise_4.InputReader;

import java.util.Calendar;
import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) throws Exception {
        try (InputReader inputReader = new InputReader()) {
            //Reading input
            String length = inputReader.readString("What is the length of the room in feet?");
            String width = inputReader.readString("What is the width of the room in feet?");
            //Logic
            AreaCalc areaCalc = new AreaCalc(length,width);
            String res = areaCalc.areaCalc();
            //Output
            System.out.println(res);
        }
    }
}
