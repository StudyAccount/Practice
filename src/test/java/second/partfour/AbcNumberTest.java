package second.partfour;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SleepWalker on 09.05.2016.
 */
public class AbcNumberTest {

    AbcNumber abcNumber = new AbcNumber();
    @Test
    public void convert() throws Exception {

        String num = "bcd";

        int expected = 123;

        int actual = abcNumber.convert(num);
        Assert.assertEquals("", expected, actual);
    }

}