package first.partfour;

/**
 * Created by User on 26.04.2016.
 */
public class FindMaxNumber {
    public int max(int[] input) {

        int max = input[0];

        for (int i = 0; i < input.length; i++){
            if (input[i] > max){
                max = input[i];
            }
        }
        return max;
    }
}
