import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        System.out.println("What is your current age?");
        Scanner sc = new Scanner(System.in);
        String current_age = sc.nextLine();
        System.out.println("At what age would you like to retire?");
        String retire_age = sc.nextLine();

        int current_int_age = Integer.parseInt(current_age);
        int retire_int_age = Integer.parseInt(retire_age);
        int diff = retire_int_age - current_int_age;

        if (diff < 0 || current_int_age < 0 || retire_int_age < 0){
            System.out.println("Incorrect numbers");
        } else{
            int year = Calendar.getInstance().get(Calendar.YEAR);
            System.out.println("You have " + diff + " years left until you can retire." + "\n" +
                               "It's " + year + " ,so you can retire in " + (year + diff));
        }
        sc.close();
    }
}
