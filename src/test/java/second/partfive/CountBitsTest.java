package second.partfive;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 10.05.2016.
 */
public class CountBitsTest {

    CountBits countBits = new CountBits();

    @Test
    public void testCount() throws Exception {
        int input = 13;
        int expected = 3;

        int actual = countBits.count(input);

        Assert.assertEquals("", expected, actual);


    }

    @Test
    public void testCount2() throws Exception {
        int input = -13;
        int expected = 30;

        int actual = countBits.count(input);

        Assert.assertEquals("", expected, actual);


    }

}