package hu.helixlab;

/**
 * Created by Hp_Workplace on 2017. 04. 17..
 */
public interface IMatrixOperation {

    void printMatrix(int matrix[][]);
    int[][] initMatrixRandomNumbers(int n, int m, int min, int max);
    int[][] multiplyWithScalar(int scalar, int matrix[][]);
    int[][] sum(int matrix[][], int matrix1[][]);
}
