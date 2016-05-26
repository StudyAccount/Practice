package fifth.parttwo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 26.05.2016.
 */
public class KmpSubMoveTest {

    KmpSubMove kmpSubMove = new KmpSubMove();

    @Test
    public void testSubMoveQuantity() throws Exception {
        String inputStr = "abcd";
        String resultStr = "cdab";
        int expected = 2;

        int actual = kmpSubMove.subMoveQuantity(inputStr, resultStr);

        Assert.assertEquals("", expected, actual);


    }

    @Test
    public void testSubMoveQuantity2() throws Exception {
        String inputStr = "abcd";
        String resultStr = "";
        int expected = -1;

        int actual = kmpSubMove.subMoveQuantity(inputStr, resultStr);

        Assert.assertEquals("", expected, actual);


    }
}