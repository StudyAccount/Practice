package second.partsix;

/**
 * Created by SleepWalker on 10.05.2016.
 */
public class SetZero {

    public static final int ASCII_1 = 49;
    public static final char NULL = '0';

    public int set(int num, int i) {

        StringBuilder inputStringBuilder = new StringBuilder();
        inputStringBuilder.append(Integer.toBinaryString(num));

        StringBuilder outputStringBuilder = new StringBuilder();

        int j = 0;

        try {
            while (j < inputStringBuilder.length()) {

                if (inputStringBuilder.charAt(inputStringBuilder.length() - i) == ASCII_1 &&
                        j == inputStringBuilder.length() - i) {

                    outputStringBuilder.append(NULL);
                } else {
                    outputStringBuilder.append(inputStringBuilder.charAt(j));
                }

                j++;
            }

            int result = Integer.parseInt(outputStringBuilder.toString(), 2);

            return result;
        } catch (StringIndexOutOfBoundsException e){

            return num;
        }
    }
}
