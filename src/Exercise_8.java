import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args) {
        System.out.println("How many people?");
        Scanner sc = new Scanner(System.in);
        String people = sc.nextLine();
        System.out.println("How many pizzas do you have?");
        String pizzas = sc.nextLine();

        int int_people = Integer.parseInt(people);
        int int_pizzas = Integer.parseInt(pizzas);

        if (int_people < 0 || int_pizzas < 0) {
            System.out.println("Incorrect numbers");
        } else {
            int leftovers = 0;
            int pieces = 8 * int_pizzas;
            int each = pieces / int_people;
            if (pieces % int_people != 0 ){
                leftovers = pieces % int_people;
            }
            System.out.println(int_people + " have " + int_pizzas + " pizzas\n" +
                               "Each person gets " + each + " peaces\n" +
                               leftovers + " leftover peaces" );

        }
    }
}
