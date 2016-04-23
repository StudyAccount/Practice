package first.parttwo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 24.04.2016.
 */
public class SumDigitsTest {
    SumDigits sumDigits = new SumDigits();

    @Test (timeout = 1000)
    public void testSum() throws Exception {

        int input = 123;
        int expected = 6;

        int actual = sumDigits.sum(input);

        Assert.assertEquals("", expected, actual);
    }
}