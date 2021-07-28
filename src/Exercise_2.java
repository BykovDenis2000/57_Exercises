import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        System.out.println("What is the input string?");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            count++;
        }
        System.out.println(str + " has " + count + " characters");
        sc.close();
    }
}
