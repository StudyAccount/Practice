package first.partfour;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 26.04.2016.
 */
public class FindMaxNumberTest {
    FindMaxNumber findMaxNumber = new FindMaxNumber();

    @Test
    public void testMax() throws Exception {
        int[] input = {0, 2, 74, -10, 22};
        int expected = 74;

        int actual = findMaxNumber.max(input);
        Assert.assertEquals("", expected, actual);
    }

    @Test
    public void testSingleElementArray() throws Exception {
        int[] input = {33};
        int expected = 33;

        int actual = findMaxNumber.max(input);
        Assert.assertEquals("", expected, actual);
    }
}