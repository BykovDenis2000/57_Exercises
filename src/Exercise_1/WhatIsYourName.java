package Exercise_1;

import java.util.Scanner;

public class WhatIsYourName {
    public String name;

    public WhatIsYourName(){}
    public WhatIsYourName(String name) {
        this.name = name;
    }
    public String result(){
        String res = "";
        if (isAlpha(name)) {
            res = "Hello, " + name + "! Nice to meet you!";
        } else {
            res = "Enter the line!";
        }
        return res;
    }
    public boolean isAlpha(String name) {
        return name.matches("[а-яА-Яa-zA-Z]+");
    }
    public String enter_str(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.next();
        return name;
    }
}