package Exercise_3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuoteTest {

    @Test
    public void quote_define() {
        String q = "Meow";
        String name = "Cat";
        Quote quote = new Quote();
        String expected = quote.quote_define(q,name);
        String actual = name + " says, " + "\"" + q + "\"" ;
        Assert.assertEquals(expected,actual);
    }
}