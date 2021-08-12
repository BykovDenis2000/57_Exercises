package Exercise_6;

import java.util.Calendar;

public class RetireCalc {
    public int currentAge;
    public int retireAge;
    public RetireCalc(){}
    public RetireCalc(String currentAge, String retireAge){
        this.currentAge = Integer.parseInt(currentAge);
        this.retireAge = Integer.parseInt(retireAge);
    }
    public String retireCalc(){
        if (currentAge < 0 || retireAge < 0 || currentAge > retireAge) {
            return "Incorrect numbers";
        } else {
            int diff = retireAge - currentAge;
            int year = Calendar.getInstance().get(Calendar.YEAR);
            return ("You have " + diff + " years left until you can retire." + "\n" +
                    "It's " + year + " ,so you can retire in " + (year + diff));
        }
    }
}
