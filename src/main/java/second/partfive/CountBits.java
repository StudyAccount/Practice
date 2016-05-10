package second.partfive;

/**
 * Created by User on 10.05.2016.
 */
public class CountBits {

    public static final int ASCII_1 = 49;

    public int count(int num) {


        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString(num));

        int result = 0;
        int i = 0;

        while (i < sb.length()){

            if (ASCII_1 == sb.charAt(i)){
                result++;
            }

            i++;
        }

        return result;
    }
}
