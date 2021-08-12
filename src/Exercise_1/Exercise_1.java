package Exercise_1;

import Exercise_4.InputReader;

public class Exercise_1 {
    public static void main(String[] args) throws Exception {
        try (InputReader inputReader = new InputReader()) {
            //Reading input
            String name = inputReader.readString("What is your name:");
            //Logic
            WhatIsYourName wiyn = new WhatIsYourName(name);
            String res = wiyn.result();
            //Output
            System.out.println(res);
        }
    }
}
