package Exercise_3;

import Exercise_4.InputReader;

public class Exercise_3 {
    public static void main(String[] args) throws Exception {
        try (InputReader inputReader = new InputReader()) {
            //Reading input
            String quote = inputReader.readString("What is the quote?");
            String name = inputReader.readString("Who said that?");
            //Logic
            Quote q = new Quote();
            String str = q.quote_define(quote, name);
            //Output
            System.out.println(str);
        }
    }
}
