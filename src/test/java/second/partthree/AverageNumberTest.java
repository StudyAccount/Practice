package second.partthree;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 06.05.2016.
 */
public class AverageNumberTest {

    AverageNumber averageNumber = new AverageNumber();

    @Test
    public void testAverage() throws Exception {
        int a = 2147483647;
        int b = 2147483645;

        int expected = 2147483646;

        int actual = averageNumber.average(a, b);
        Assert.assertEquals("", expected, actual);
    }

    @Test
    public void testAverage2() throws Exception {
        int a = 7;
        int b = 5;

        int expected = 6;

        int actual = averageNumber.average(a, b);
        Assert.assertEquals("", expected, actual);

    }
}