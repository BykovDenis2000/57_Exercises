import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        System.out.println("Enter the price of item 1:");
        Scanner sc = new Scanner(System.in);
        int price_1 = sc.nextInt();
        System.out.println("Enter the quantity of item 1:");
        int quantity_1 = sc.nextInt();
        System.out.println("Enter the price of item 2:");
        int price_2 = sc.nextInt();
        System.out.println("Enter the quantity of item 2:");
        int quantity_2 = sc.nextInt();
        System.out.println("Enter the price of item 3:");
        int price_3 = sc.nextInt();
        System.out.println("Enter the quantity of item 3:");
        int quantity_3 = sc.nextInt();


        if (price_1 < 0 || quantity_1 < 0 || price_2 < 0 || quantity_2 < 0 || price_3 < 0 || quantity_3 < 0) {
            System.out.println("Incorrect numbers");
        } else {
            int subtotal = price_1 * quantity_1 + price_2 * quantity_2 + price_3 * quantity_3;
            float tax = (float)subtotal* 5 / 100;
            float total = subtotal + tax;
            System.out.println("Subtotal: " + subtotal + "\nTax: " + tax + "\nTotal: "+ total );
        }
        sc.close();
    }
}
