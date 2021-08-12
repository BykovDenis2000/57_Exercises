package Exercise_2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharCalcTest {

    @Test
    public void calculate() {
        String str = "blablabla";
        CharCalc charCalc = new CharCalc(str);
        int expected = charCalc.calculate();
        int actual = str.length();
        Assert.assertEquals(expected,actual);
    }
}