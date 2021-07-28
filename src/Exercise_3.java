import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        System.out.println("What is the quote?");
        Scanner sc = new Scanner(System.in);
        String quote = sc.nextLine();
        System.out.println("Who said that?");
        String name = sc.nextLine();
        System.out.println(name + " says, " + "\"" + quote + "\"");
        sc.close();
    }
}
