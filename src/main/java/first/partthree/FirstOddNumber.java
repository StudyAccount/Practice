package first.partthree;

/**
 * Created by User on 26.04.2016.
 */
public class FirstOddNumber {
    public int find(int[] input) {

        int result = -1;

        for (int i = 0; i < input.length; i++){
            if (input[i] % 2 != 0){
                result = i;
                break;
            }else {
                result = -1;
            }
        }
    return result;
    }
}
