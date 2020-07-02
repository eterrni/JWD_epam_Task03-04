package by.epamtc.homework_4;

import java.util.Arrays;
import java.util.Random;

public class Task04 {
    public static void main(String[] args) {

        Random random = new Random();
        int n = random.nextInt(10);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        int[][] matrix = fillingMatrix(array, n);
        outputMatrix(matrix);
    }

    private static int[][] fillingMatrix(int[] array, int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            int a=0;
            for (int j = 0; j < n; j++) {
                matrix[i][j]=(int)Math.pow(array[a],i+1);
                a++;
            }
        }


        return matrix;
    }

    private static void outputMatrix(int[][] array) {
        for (int[] x : array) {
            System.out.println(Arrays.toString(x));
        }
        System.out.println();
    }
}
