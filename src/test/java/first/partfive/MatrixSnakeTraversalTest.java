package first.partfive;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 26.04.2016.
 */
public class MatrixSnakeTraversalTest {
    MatrixSnakeTraversal matrixSnakeTraversal = new MatrixSnakeTraversal();

    @Test
    public void testPrint() throws Exception {
        int[][] input = {{0, 2, 74}, {1, 3, 4}, {11, 12, 13}};
        int[] expected = {0, 1, 11, 12, 3, 2 , 74, 4, 13};

        int[] actual = matrixSnakeTraversal.print(input);
        Assert.assertArrayEquals("", expected, actual);
    }

    @Test
    public void testPrintArray() throws Exception {
        int[][] input = {{1, 2}, {3, 4}};
        int[] expected = {1, 3, 4, 2};

        int[] actual = matrixSnakeTraversal.print(input);
        Assert.assertArrayEquals("", expected, actual);
    }

    @Test
    public void testPrintArray2() throws Exception {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, { 10, 11, 12  }};
        int[] expected = {1, 4, 7, 10, 11, 8, 5, 2, 3, 6, 9, 12};

        int[] actual = matrixSnakeTraversal.print(input);
        Assert.assertArrayEquals("", expected, actual);
    }

    @Test
    public void testPrintArray3() throws Exception {
        int[][] input = {{1, 2, 3}};
        int[] expected = {1, 2, 3};

        int[] actual = matrixSnakeTraversal.print(input);
        Assert.assertArrayEquals("", expected, actual);
    }
}