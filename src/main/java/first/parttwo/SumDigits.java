package first.parttwo;

/**
 * Created by User on 24.04.2016.
 */
public class SumDigits {
    public int sum(int number) {

        StringBuilder sb = new StringBuilder();
        sb.append(number);

        int result = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                result += Character.digit(sb.charAt(i), 10);
            }
        }

        return result;
    }
}
