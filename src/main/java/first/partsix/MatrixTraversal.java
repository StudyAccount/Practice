package first.partsix;

import java.util.ArrayList;

/**
 * Created by User on 26.04.2016.
 */
public class MatrixTraversal {
    public int[] print(int[][] input) {

        ArrayList<Integer> temp = new ArrayList<Integer>();

        int firstColumn = 0;
        int firstRow = 0;
        int lastColumn = input[0].length - 1;
        int lastRow = input.length - 1;

        while (lastRow >= 0) {
            for (int j = firstColumn; j <= lastColumn; j++) {
                temp.add(input[firstRow][j]);
                }
            firstRow++;

            for (int i = firstRow; i <= lastRow; i++) {
                temp.add(input[i][lastColumn]);
                }
            lastColumn--;

            if (firstRow > lastRow) break;

            for (int j = lastColumn; j >= firstColumn; j--) {
                temp.add(input[lastRow][j]);
                }
            lastRow--;

            if (firstRow > lastRow) break;

            for (int i = lastRow; i >= firstRow; i--) {
                temp.add(input[i][firstColumn]);
                }
            firstColumn++;

        }

        return arrayListToArray(temp);
    }

    private int[] arrayListToArray(ArrayList<Integer> temp) {
        int[] output = new int[temp.size()];

        for (int k = 0; k < output.length; k++){
            output[k] = temp.get(k);
        }

        return output;
    }
}
