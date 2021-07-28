import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.next();
        if (isAlpha(name)) {
            System.out.println("Hello, " + name + "! Nice to meet you!");
        } else {
            System.out.println("Enter the line!");
        }
        sc.close();
    }
    public static boolean isAlpha(String name) {
        return name.matches("[а-яА-Яa-zA-Z]+");
    }
}
