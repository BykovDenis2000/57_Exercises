import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        System.out.println("Enter a noun:");
        Scanner sc = new Scanner(System.in);
        String noun = sc.nextLine();
        System.out.println("Enter a verb:");
        String verb = sc.nextLine();
        System.out.println("Enter an adjective:");
        String adjective = sc.nextLine();
        System.out.println("Enter an adverb:");
        String adverb = sc.nextLine();
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? Cool!");
        sc.close();
    }
}
