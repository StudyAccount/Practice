package second.parttwo;

/**
 * Created by User on 06.05.2016.
 */
public class PositiveAverageNumber {
    public int average(int a, int b) {

        long longA = a;
        long longB = b;

        long result = ((longA + longB) / 2);

        return (int) result;
    }
}
