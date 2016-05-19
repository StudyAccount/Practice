package fourth.partthree;

/**
 * Created by User on 19.05.2016.
 */
public class Doubles {
    public static final int ASCII_MINUS = 45;
    public static final int ASCII_DOT = 46;

    public Double parse(String s) {

        Double result = null;

        StringBuilder input = new StringBuilder();
        input.append(s);
        StringBuilder output = new StringBuilder();


        int iterator = 0;
        boolean isPositive = true;
        int dotCount = 0;


        while (iterator < input.length()){

            if (iterator == 0 && input.charAt(0) == ASCII_MINUS){

                isPositive = false;
                iterator++;
            }

            if (Character.isDigit(input.charAt(iterator))){

                    output.append(input.charAt(iterator));
                    iterator++;
            }else {

                if (input.charAt(iterator) == ASCII_DOT && dotCount == 0){

                    output.append(input.charAt(iterator));
                    dotCount++;
                    iterator++;
                } else {

                    return null;
                }
            }
        }


        if (output.length() == 1 && !Character.isDigit(output.charAt(0))) return null;

        result = Double.parseDouble(output.toString());

        if (!isPositive) {

            result = -1.0 * result;
        }

        return result;
    }
}
