package second.partone;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 06.05.2016.
 */
public class AddNumberBase36Test {

    AddNumberBase36 addNumberBase36 = new AddNumberBase36();

    @Test
    public void testAdd() throws Exception {
        String a = "9";
        String b = "1";

        String expected = "a";

        String actual = addNumberBase36.add(a, b);
        Assert.assertEquals("", expected, actual);

    }

    @Test
    public void testAddBigString() throws Exception {
        String a = "zjfghfhdsdfathjjhgjhghjfjfjhjhdsrreqqklhu456hfz5";
        String b = "wsfgsgds56346263fgfhghfghfhgfsrr5476hjfgdhdhg3N";

        String expected = "10g7vy7xrkildxnlpkvzwxy0uzwyyzx6kiwixx24xahmjyw2s";

        String actual = addNumberBase36.add(a, b);
        Assert.assertEquals("", expected, actual);

    }



}