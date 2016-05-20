package fourth.partthree;

/**
 * Created by User on 19.05.2016.
 */
public class Doubles {
    public static final int ASCII_MINUS = 45;
    public static final int ASCII_PLUS = 43;
    public static final int ASCII_DOT = 46;
    public static final int ASCII_E = 101;

    public Double parse(String s) {

        Double result = null;

        StringBuilder input = new StringBuilder();
        input.append(s);
        StringBuilder output = new StringBuilder();
        StringBuilder extraFactor = new StringBuilder();

        int iterator = 0;
        boolean isPositive = true;
        int dotCount = 0;

        if (input.length() == 0) return null;

        while (iterator < input.length()){

            if (iterator == 0 && input.charAt(iterator) == ASCII_MINUS){

                isPositive = false;
                iterator++;

            }else if (iterator == 0 && input.charAt(iterator) == ASCII_PLUS){

                iterator++;
            }

            if (input.charAt(iterator) == ASCII_DOT && dotCount == 0){

                int temp = iterator;
                iterator++;

                if (input.length() > iterator + 1){

                    if(input.charAt(iterator) == ASCII_E && Character.isDigit(input.charAt(iterator + 1))){

                        iterator++;
                        while (input.length() >= iterator + 1){

                            if (Character.isDigit(input.charAt(iterator))){

                                extraFactor.append(input.charAt(iterator));
                                iterator++;
                            }else {
                                return null;
                            }

                        }

                        if (output.length() > 0) {

                            int factor = Integer.parseInt(extraFactor.toString());
                            while (factor > 0) {

                                output.append('0');
                                factor--;
                            }
                        }else return null;
                    }

                }

                output.append(input.charAt(temp));
                dotCount++;

                if (iterator > input.length() - 1){
                    break;
                }
            }

            if (Character.isDigit(input.charAt(iterator))){

                output.append(input.charAt(iterator));
                iterator++;
            }else return null;

        }


        if (output.length() == 1 && !Character.isDigit(output.charAt(0))) return null;

        result = Double.parseDouble(output.toString());

        if (!isPositive) {

            result = -1.0 * result;
        }

        return result;
    }
}
