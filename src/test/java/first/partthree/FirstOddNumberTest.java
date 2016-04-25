package first.partthree;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 26.04.2016.
 */
public class FirstOddNumberTest {
    FirstOddNumber firstOddNumber = new FirstOddNumber();

    @Test
    public void testFind() throws Exception {
        int[] input = {0, 2, 74, -10, 1};
        int expected = 4;

        int actual = firstOddNumber.find(input);
        Assert.assertEquals("", expected, actual);

    }

    @Test
    public void testFindOnEvenArray() throws Exception {
        int[] input = {0, 2, 74, -10, 22};
        int expected = -1;

        int actual = firstOddNumber.find(input);
        Assert.assertEquals("", expected, actual);


    }

    @Test
    public void testFindOnEmptyArray() throws Exception {
        int[] input = {};
        int expected = -1;

        int actual = firstOddNumber.find(input);
        Assert.assertEquals("", expected, actual);


    }

    @Test
    public void testFindOnSingleOddArray() throws Exception {
        int[] input = {3};
        int expected = 0;

        int actual = firstOddNumber.find(input);
        Assert.assertEquals("", expected, actual);


    }

}