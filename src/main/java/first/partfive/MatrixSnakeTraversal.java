package first.partfive;

import java.util.ArrayList;

/**
 * Created by User on 26.04.2016.
 */
public class MatrixSnakeTraversal {
    public int[] print(int[][] input) {

        ArrayList<Integer> temp = new ArrayList<Integer>();

        for (int i = 0; i < input[0].length; i++){

            if (i % 2 == 0) {
                for (int j = 0; j < input.length; j++) {
                    temp.add(input[j][i]);
                }
            }else {
                for (int j = input.length - 1; j >= 0; j--) {
                    temp.add(input[j][i]);
                }
            }
        }

        int[] output = new int[temp.size()];

        for (int k = 0; k < output.length; k++){
            output[k] = temp.get(k).intValue();
        }

        return output;
    }
}
