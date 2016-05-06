package second.partone;

import java.math.BigInteger;

/**
 * Created by User on 06.05.2016.
 */
public class AddNumberBase36 {

    public String add(String a, String b) {

        BigInteger first = new BigInteger(a, 36);
        BigInteger second = new BigInteger(b, 36);

        String result = first.add(second).toString(36);

        return result ;
    }
}
