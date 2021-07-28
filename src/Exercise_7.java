import java.util.Calendar;
import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        System.out.println("What is the length of the room in feet?");
        Scanner sc = new Scanner(System.in);
        String length = sc.nextLine();
        System.out.println("What is the width of the room in feet?");
        String width = sc.nextLine();

        int int_length = Integer.parseInt(length);
        int int_width = Integer.parseInt(width);

        if (int_length < 0 || int_width < 0) {
            System.out.println("Incorrect numbers");
        } else {
            double area = ((float) int_length * (float) int_width) * 0.0929;
            System.out.println("The area is\n" + (int_length * int_width) + " square feet\n" + area + " square meters" );
        }
        sc.close();
    }
}
