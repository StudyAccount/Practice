package fifth.partone;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 26.05.2016.
 */
public class KmpSmallestPeriodTest {

    KmpSmallestPeriod kmpSmallestPeriod = new KmpSmallestPeriod();

    @Test
    public void testFindSmalletstPeriod() throws Exception {
        String input = "abcabcabcabc";
        String expected = "abc";

        String actual = kmpSmallestPeriod.findSmalletstPeriod(input);

        Assert.assertEquals("", expected, actual);

    }

    @Test
    public void testFindSmalletstPeriod2() throws Exception {
        String input = "aabcaabcaabc";
        String expected = "aabc";

        String actual = kmpSmallestPeriod.findSmalletstPeriod(input);

        Assert.assertEquals("", expected, actual);

    }

    @Test
    public void testFindSmalletstPeriod3() throws Exception {
        String input = "abdabcabdabc";
        String expected = "abdabc";

        String actual = kmpSmallestPeriod.findSmalletstPeriod(input);

        Assert.assertEquals("", expected, actual);

    }
}