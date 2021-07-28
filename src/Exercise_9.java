import java.util.Scanner;

public class Exercise_9 {
    public static void main(String[] args) {
        System.out.println("What is the length of the ceiling in feet?");
        Scanner sc = new Scanner(System.in);
        String length = sc.nextLine();
        System.out.println("What is the width of the ceiling in feet?");
        String width = sc.nextLine();

        int int_length = Integer.parseInt(length);
        int int_width = Integer.parseInt(width);
        int gallons = 0;

        if (int_length < 0 || int_width < 0) {
            System.out.println("Incorrect numbers");
        } else {
            int area = int_length * int_width;
            if(area % 350 == 0){
                gallons = area / 350;
            } else {
                gallons = area / 350 + 1;
            }
            System.out.println("The area is\n" + area + " square feet\n" + "You need " + gallons + " gallons" );
        }
        sc.close();
    }
}
