package first.partsix;

import java.util.ArrayList;

/**
 * Created by User on 26.04.2016.
 */
public class MatrixTraversal {
    public int[] print(int[][] input) {

        ArrayList<Integer> temp = new ArrayList<Integer>();

        int firstRowElement = 0;
        int lastRowElement = input.length - 1;
        int firstColumnElement = 0;
        int lastColumnElement = input[0].length - 1;
        int i = 0;
        int j = 0;
        int directionColumn = 1;
        int directionRow = 1;
        int currentColumn = 0;
        int currentRow = 0;


        while (i >= firstRowElement && i <= lastRowElement){

            while (j >= firstColumnElement && j <= lastColumnElement){

                temp.add(input[i][j]);
                currentColumn = j;
                currentRow = i;
                j += directionColumn;
            }

            if (j >= 0) {
                i += directionRow;

            } else {
                directionRow = -1 * directionRow;
                i += directionRow;
                lastColumnElement = currentColumn;
                directionColumn = -1 * directionColumn;

            }

            if (i <= lastRowElement) {
                j = currentColumn;

            }else {
                directionColumn = -1 * directionColumn;
//                j += directionColumn;
                j -= 2;
                i = currentRow;
                lastColumnElement = currentColumn - 1;
            }

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
