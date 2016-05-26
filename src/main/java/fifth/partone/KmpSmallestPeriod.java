package fifth.partone;

/**
 * Created by User on 25.05.2016.
 */
public class KmpSmallestPeriod {
    public String findSmalletstPeriod(String input) {


        StringBuilder inputSb = new StringBuilder();
        StringBuilder tempSb = new StringBuilder();
        StringBuilder outputSb = new StringBuilder();
        inputSb.append(input);

        int i = 0;
        int k = 0;
        boolean index = true;

        while (index) {
            while (i < inputSb.length()) {

                tempSb.append(inputSb.charAt(i));

                if (i > 0 && inputSb.charAt(i) == tempSb.charAt(k)) {

                    index = false;
                    outputSb.append(tempSb.charAt(k));
                    k++;
                }else{

                    outputSb.delete(0, outputSb.length());
                    k = 0;
                }

                i++;
            }

            if (index == false) {

                if (outputSb.length() > 0) {
                    inputSb.delete(0, inputSb.length());
                    tempSb.delete(0, tempSb.length());
                    inputSb.append(outputSb);
                    outputSb.delete(0, outputSb.length());
                    index = true;
                    i = 0;
                    k = 0;
                } else return inputSb.toString();

            }else return inputSb.toString();
        }

        return null;
    }
}
