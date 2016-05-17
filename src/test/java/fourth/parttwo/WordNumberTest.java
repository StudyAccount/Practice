package fourth.parttwo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 18.05.2016.
 */
public class WordNumberTest {

    WordNumber wordNumber = new WordNumber();

    @Test
    public void testCount() throws Exception {
        String input = "asdasd1asdsad aa 3 4 asd";
        int expected = 4;

        int actual = wordNumber.count(input);

        Assert.assertEquals("", expected, actual);

    }

    @Test
    public void testCountEmpty() throws Exception {
        String input = "";
        int expected = 0;

        int actual = wordNumber.count(input);

        Assert.assertEquals("", expected, actual);

    }

    @Test
    public void testCount2() throws Exception {
        String input = "1";
        int expected = 0;

        int actual = wordNumber.count(input);

        Assert.assertEquals("", expected, actual);

    }
}