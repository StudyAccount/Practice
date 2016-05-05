package first.partsix;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 26.04.2016.
 */
public class MatrixTraversalTest {

        MatrixTraversal matrixTraversal = new MatrixTraversal();

        @Test
        public void testPrint() throws Exception {
            int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12},{13, 14, 15, 16}};
            int[] expected = {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};

            int[] actual = matrixTraversal.print(input);
            Assert.assertArrayEquals("", expected, actual);
        }

        @Test
        public void testPrintArray() throws Exception {
            int[][] input = {{1, 2}, {3, 4}};
            int[] expected = {1, 2, 4, 3};

            int[] actual = matrixTraversal.print(input);
            Assert.assertArrayEquals("", expected, actual);
        }

    @Test
    public void testPrintArray2() throws Exception {
        int[][] input = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}};
        int[] expected = {1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8};

        int[] actual = matrixTraversal.print(input);
        Assert.assertArrayEquals("", expected, actual);
    }

    @Test
    public void testPrintArray3() throws Exception {
        int[][] input = {{1, 2, 3}};
        int[] expected = {1, 2, 3};

        int[] actual = matrixTraversal.print(input);
        Assert.assertArrayEquals("", expected, actual);
    }

    @Test
    public void testPrintEmptyArray() throws Exception {
        int[][] input = {{}};
        int[] expected = {};

        int[] actual = matrixTraversal.print(input);
        Assert.assertArrayEquals("", expected, actual);
    }

}