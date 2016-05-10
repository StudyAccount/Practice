package second.partsix;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by SleepWalker on 10.05.2016.
 */
public class SetZeroTest {

    SetZero setZero = new SetZero();

    @Test
    public void TestSet() throws Exception {
        int input = 6;
        int i = 2;
        int expected = 4;

        int actual = setZero.set(input, i);

        Assert.assertEquals("", expected, actual);
    }

    @Test
    public void TestSet2() throws Exception {
        int input = 10;
        int i = 2;
        int expected = 8;

        int actual = setZero.set(input, i);

        Assert.assertEquals("", expected, actual);
    }

    @Test
    public void TestSet3() throws Exception {
        int input = 3;
        int i = 5;
        int expected = 3;

        int actual = setZero.set(input, i);

        Assert.assertEquals("", expected, actual);
    }

    @Test
    public void TestSet4() throws Exception {
        int input = 429;
        int i = 8;
        int expected = 301;

        int actual = setZero.set(input, i);

        Assert.assertEquals("", expected, actual);
    }

    @Test
    public void TestSet5() throws Exception {
        int input = -1;
        int i = 31;
        int expected = -1073741825;

        int actual = setZero.set(input, i);

        Assert.assertEquals("", expected, actual);
    }
}