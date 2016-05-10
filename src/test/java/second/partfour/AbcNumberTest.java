package second.partfour;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 10.05.2016.
 */
public class AbcNumberTest {

    AbcNumber abcNumber = new AbcNumber();

    @Test
    public void testConvert() throws Exception {

        String input = "bcd";
        int expected = 123;

        int actual = abcNumber.convert(input);

        Assert.assertEquals("", expected, actual);

    }
}