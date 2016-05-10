package second.partsix;

/**
 * Created by SleepWalker on 10.05.2016.
 */
public class SetZero {

    public static final int ASCII_1 = 49;
    public static final String NULL = "0";

    public int set(int num, int i) {

        StringBuilder inputStringBuilder = new StringBuilder();
        inputStringBuilder.append(Integer.toBinaryString(num));

        try {
            int length = inputStringBuilder.length();

            if (inputStringBuilder.charAt(length - i) == ASCII_1){
                    inputStringBuilder.replace(length - i, length - i + 1, NULL);
                }

                int result = (int) Long.parseLong(inputStringBuilder.toString(), 2);

                return result;

        } catch (StringIndexOutOfBoundsException e){

            return num;
        }
    }
}
