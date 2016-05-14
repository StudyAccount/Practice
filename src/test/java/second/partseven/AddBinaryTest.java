package second.partseven;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 14.05.2016.
 */
public class AddBinaryTest {

   AddBinary addBinary = new AddBinary();

    @Test
    public void testAdd() throws Exception {
        String a = "11";
        String b = "10";
        String  expected = "101";

        String actual =  addBinary.add(a, b);

        Assert.assertEquals("", expected, actual);
    }

    @Test
    public void testAdd2() throws Exception {
        String a = "10000000000000000000000000000000";
        String b = "10000000000000000000000000000000";
        String expected = "100000000000000000000000000000000";

        String actual =  addBinary.add(a, b);

        Assert.assertEquals("", expected, actual);
    }

    @Test
    public void testAdd3() throws Exception {
        String a = "1";
        String b = "11";
        String expected = "100";

        String actual =  addBinary.add(a, b);

        Assert.assertEquals("", expected, actual);
    }
    @Test
    public void testAdd4() throws Exception {
        String a = "1111111111111111111111111111111";
        String b = "1111111111111111111111111111111";
        String expected = "11111111111111111111111111111110";

        String actual =  addBinary.add(a, b);

        Assert.assertEquals("", expected, actual);
    }
}