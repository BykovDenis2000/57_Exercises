package Exercise_2;

public class CharCalc {
    public String str;
    public int count;

    public CharCalc() {
    }

    public CharCalc(String str) {
        this.str = str;
        this.count = 0;
    }

    public int calculate() {
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        return count;
    }
}
