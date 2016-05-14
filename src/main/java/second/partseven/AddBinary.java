package second.partseven;

/**
 * Created by User on 11.05.2016.
 */
public class AddBinary {

    public static final int SUMMERY_OF_TWO_1 = 2;
    public static final int NUMBER_OF_VARIABLES = 2;

    String add(String a, String b) {

        StringBuilder firstSb = new StringBuilder();
        StringBuilder secondSb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        firstSb.append(a).reverse();
        secondSb.append(b).reverse();

        int i = 0;
        if (firstSb.length() != secondSb.length()) {

            while (i < Math.max(firstSb.length(), secondSb.length())) {

                if (firstSb.length() > secondSb.length()) {
                    secondSb.append('0');
                } else if (secondSb.length() > firstSb.length()) {
                    firstSb.append('0');
                }
                i++;
            }
        }

        int j = 0;
        int temp = 0;
        while (j < firstSb.length()){

            int summaryOfElements = Character.getNumericValue(firstSb.charAt(j)) +
                    Character.getNumericValue(secondSb.charAt(j));

            int temporaryValueOfElement = summaryOfElements % NUMBER_OF_VARIABLES;

            int currentValue = (temporaryValueOfElement + temp) % NUMBER_OF_VARIABLES;

            if (summaryOfElements == SUMMERY_OF_TWO_1 || (temporaryValueOfElement + temp) == SUMMERY_OF_TWO_1){
                temp = 1;
            } else {
                temp = 0;
            }

            result.append(currentValue);

            j++;
        }

        if (temp == 1){
            result.append(temp);
        }

        return result.reverse().toString();
    }
}
