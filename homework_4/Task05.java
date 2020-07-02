package by.epamtc.homework_4;

import java.util.Arrays;
import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrix_A = new int[3][3];
        int[][] matrix_B = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix_A[i][j] = random.nextInt(4);
                matrix_B[i][j] = random.nextInt(4);
            }
        }
        outputMatrix(matrix_A);
        outputMatrix(matrix_B);
        int[][] matrix_C = matrixMultiplication(matrix_A, matrix_B);
        outputMatrix(matrix_C);

    }

    private static int[][] matrixMultiplication(int[][] matrix_A, int[][] matrix_B) {
        int rows_A = matrix_A.length;
        int rows_B = matrix_B.length;
        int columns_A = matrix_A[0].length;
        int columns_B = matrix_B[0].length;

        int[][] multiplicationMatrix = new int[rows_A][columns_B];
        if (columns_A != rows_B) {
            return multiplicationMatrix;
        }
        for (int i = 0; i < rows_A; i++) {
            for (int j = 0; j < columns_B; j++) {
                for (int k = 0; k < columns_A; k++) {
                    multiplicationMatrix[i][j] += matrix_A[i][k] * matrix_B[k][j];
                }
            }
        }
        return multiplicationMatrix;
    }

    private static void outputMatrix(int[][] array) {
        for (int[] x : array) {
            System.out.println(Arrays.toString(x));
        }
        System.out.println();
    }
}
