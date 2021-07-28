import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        System.out.println("What is the first number?");
        Scanner sc = new Scanner(System.in);
        String first_number = sc.nextLine();
        System.out.println("What is the second number?");
        String second_number = sc.nextLine();

        int first_int_number = Integer.parseInt(first_number);
        int second_int_number = Integer.parseInt(second_number);

        System.out.println(first_int_number + " + " + second_int_number + " = " + (first_int_number + second_int_number) + "\n" +
                           first_int_number + " - " + second_int_number + " = " + (first_int_number - second_int_number) + "\n" +
                           first_int_number + " * " + second_int_number + " = " + (first_int_number * second_int_number) + "\n" +
                           first_int_number + " / " + second_int_number + " = " + ((float)first_int_number / (float)second_int_number));
        sc.close();
    }
}
