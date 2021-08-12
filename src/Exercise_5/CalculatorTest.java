package Exercise_5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    public String first_num = "10";
    public String second_num = "5";
    public Calculator calculator = new Calculator(first_num,second_num);
    @Test
    public void sum() {
        int actual = 10 + 5;
        Assert.assertEquals(calculator.sum(),actual);
    }

    @Test
    public void sub() {
        int actual = 10 - 5;
        Assert.assertEquals(calculator.sub(),actual);
    }

    @Test
    public void mult() {
        int actual = 10 * 5;
        Assert.assertEquals(calculator.mult(),actual);
    }

    @Test
    public void div() {
        float actual = 10F / 5F;
        Assert.assertEquals(calculator.div(),actual,0);
    }
}