package second.partfour;

/**
 * Created by User on 10.05.2016.
 */
public class AbcNumber {
    public static final int ASCII_LOW_A = 97;
    public static final int BIT = 10;

    public int convert(String num) {

        StringBuilder sb = new StringBuilder();
        sb.append(num);

        int result = 0;
        int i = 0;

        while (i < sb.length()) {

            int characterID = (int) sb.charAt(i) - ASCII_LOW_A;
            result = result * BIT + characterID;
            i++;
        }

        return result;

    }
}
