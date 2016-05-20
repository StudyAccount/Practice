package fourth.partthree;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 19.05.2016.
 */
public class DoublesTest {

    Doubles doubles = new Doubles();

    @Test
    public void testParsePositive() throws Exception {
        String input = "123";
        Double expected = 123d;

        Double actual = doubles.parse(input);

        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void testParseNegative() throws Exception {
        String input = "-123";
        Double expected = -123d;

        Double actual = doubles.parse(input);

        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void testParseNegativeDouble() throws Exception {
        String input = "-123.0044";
        Double expected = -123.0044;

        Double actual = doubles.parse(input);

        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void testParsePositiveDouble() throws Exception {
        String input = "123.0044";
        Double expected = 123.0044;

        Double actual = doubles.parse(input);

        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void testParseIncorrectInput() throws Exception {
        String input = "-123.z0044";
        Double expected = null;

        Double actual = doubles.parse(input);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testParseEmptyInput() throws Exception {
        String input = "";
        Double expected = null;

        Double actual = doubles.parse(input);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testParseNullPointer() throws Exception {
        String input = "-.0";
        Double expected = -0.0;

        Double actual = doubles.parse(input);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testParseNullPointer2() throws Exception {
        String input = "-.";
        Double expected = null;

        Double actual = doubles.parse(input);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testParsePositive2() throws Exception {
        String input = "1";
        Double expected = 1.0;

        Double actual = doubles.parse(input);

        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void testParseE() throws Exception {
        String input = "2.e2";
        Double expected = 200.0;

        Double actual = doubles.parse(input);

        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void testParseENull() throws Exception {
        String input = ".e10";
        Double expected = null;

        Double actual = doubles.parse(input);

        Assert.assertEquals(expected, actual);

    }

}