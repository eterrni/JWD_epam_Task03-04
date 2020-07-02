package by.epamtc.homework_4;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[][] array = fillingMatrix(10);
        outputMatrix(array);
    }

    private static void outputMatrix(int[][] array) {
        for (int[] x : array) {
            System.out.println(Arrays.toString(x));
        }
        System.out.println();
    }

    private static int[][] fillingMatrix(int n) {
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            int increasingElement = 1;
            int decreasingElement = n;
            if (i % 2 == 0) {

                for (int j = 0; j < n; j++) {
                    array[i][j] = increasingElement;
                    increasingElement++;
                }

            } else for (int j = 0; j < n; j++) {
                array[i][j] = decreasingElement;
                decreasingElement--;
            }

        }

        return array;
    }
}
