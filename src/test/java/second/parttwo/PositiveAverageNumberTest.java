package second.parttwo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 06.05.2016.
 */
public class PositiveAverageNumberTest {
    PositiveAverageNumber positiveAverageNumber = new PositiveAverageNumber();

    @Test
    public void testAverage() throws Exception {
        int a = 2147483647;
        int b = 2147483645;

        int expected = 2147483646;

        int actual = positiveAverageNumber.average(a, b);
        Assert.assertEquals("", expected, actual);
    }

    @Test
    public void testAverage2() throws Exception {
        int a = 7;
        int b = 5;

        int expected = 6;

        int actual = positiveAverageNumber.average(a, b);
        Assert.assertEquals("", expected, actual);
    }
}