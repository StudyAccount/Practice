package fourth.parttwo;

/**
 * Created by User on 18.05.2016.
 */
public class WordNumber {
    public static final int ASCII_UPPER_A = 65;
    public static final int ASCII_UPPER_Z = 90;
    public static final int ASCII_LOW_A = 97;
    public static final int ASCII_LOW_Z = 122;

    public int count(String input) {

        StringBuilder string = new StringBuilder();
        string.append(input);

        int counter = 0;
        int iterator = 0;

        while (iterator < string.length()){

            if ((string.charAt(iterator) >= ASCII_UPPER_A && string.charAt(iterator) <= ASCII_UPPER_Z) ||
                    (string.charAt(iterator) >= ASCII_LOW_A && string.charAt(iterator) <= ASCII_LOW_Z)){

                while ((string.charAt(iterator) >= ASCII_UPPER_A && string.charAt(iterator) <= ASCII_UPPER_Z) ||
                        (string.charAt(iterator) >= ASCII_LOW_A && string.charAt(iterator) <= ASCII_LOW_Z)){

                    iterator++;

                    if (iterator >= string.length()){
                        break;
                    }
                }

                counter++;

            } else {
                iterator++;
            }

        }

        return counter;
    }
}
