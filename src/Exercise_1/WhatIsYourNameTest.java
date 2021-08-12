package Exercise_1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WhatIsYourNameTest {

    @Test
    public void isAlpha_true() {
        WhatIsYourName whatIsYourName = new WhatIsYourName();
        boolean expected = whatIsYourName.isAlpha("Denis");
        Assert.assertEquals(expected,true);
    }
    @Test
    public void isAlpha_false() {
        WhatIsYourName whatIsYourName = new WhatIsYourName();
        boolean expected = whatIsYourName.isAlpha("De1nis");
        Assert.assertEquals(expected,false);
    }
}