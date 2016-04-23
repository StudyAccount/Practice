package first.partone;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 24.04.2016.
 */
public class JoinCharactersTest {
    JoinCharacters joinCharacters = new JoinCharacters();

    @Test
    public void testArray() throws Exception {
        char[] input = {'1', '2', '3'};
        int expected = 123;

        int actual = joinCharacters.join(input);
        Assert.assertEquals("", expected, actual);

    }
}