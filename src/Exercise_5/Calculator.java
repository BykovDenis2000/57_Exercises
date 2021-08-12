package Exercise_5;

import java.util.Scanner;

public class Calculator {
    public int first_number;
    public int second_number;

    public Calculator(){}
    public Calculator(String first, String second){
        this.first_number = Integer.parseInt(first);
        this.second_number = Integer.parseInt(second);
    }
    public int sum() {
        return first_number + second_number;
    }
    public int sub() {
        return first_number - second_number;
    }
    public int mult() {
        return first_number * second_number;
    }
    public float div() {
        return ((float) first_number / (float) second_number);
    }
}
