package hu.helixlab;

public class Main {

    public static void main(String[] args) {

        int[] bubble = {3, 1, 7, -2, 9, -10};
        int[][] matrix = new int[4][4];
        Sort sort = new Sort();
        MatrixOperation matrixOperation = new MatrixOperation();
        sort.bubbleSort(bubble);
        System.out.println();
        matrixOperation.printMatrix(matrix);
        matrixOperation.initMatrixRandomNumbers(4,4,5,15);
    }
}
