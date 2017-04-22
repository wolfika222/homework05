package hu.helixlab;

import java.util.Random;

/**
 * Created by Hp_Workplace on 2017. 04. 17..
 */
public class MatrixOperation implements IMatrixOperation {

    public void printMatrix(int matrix[][]) {
        //Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                //matrix[i][j] = random.nextInt(2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] initMatrixRandomNumbers(int n, int m, int min, int max) {
        Random random = new Random();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = random.nextInt((max + 1) - min) + min;
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        return mat;
    }

    public int[][] multiplyWithScalar(int scalar, int matrix[][]){

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                matrix[i][j] = matrix[i][j] * scalar;
            }
        }
        return matrix;
    }

    public int[][] sum(int matrix[][], int matrix1[][]){
        int[][] mat = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                mat[i][j] = matrix[i][j] + matrix1[i][j];
            }
        }
        return mat;
    }
}
