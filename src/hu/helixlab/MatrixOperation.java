package hu.helixlab;

import java.util.Random;

/**
 * Created by Hp_Workplace on 2017. 04. 17..
 */
public class MatrixOperation implements IMatrixOperation {

    public void printMatrix(int matrix[][]) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
