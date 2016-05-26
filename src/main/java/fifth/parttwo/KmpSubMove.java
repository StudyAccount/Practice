package fifth.parttwo;

/**
 * Created by User on 26.05.2016.
 */
public class KmpSubMove {
    public int subMoveQuantity(String inputStr, String resultStr) {

        StringBuilder inputSb = new StringBuilder();
        StringBuilder resultSb = new StringBuilder();

        inputSb.append(inputStr);
        resultSb.append(resultStr);

        int count = 0;
        while (!inputSb.toString().equals(resultSb.toString())){

            inputSb.reverse().append(inputSb.charAt(0));
            inputSb.reverse().deleteCharAt(inputSb.length() - 1);
            count++;

            if (count > inputSb.length()) return -1;
        }

      return count;
    }
}
