package by.epamtc.homework_4;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        int[][] array = fillingMatrix(5);
        outputMatrix(array);
    }

    private static int[][] fillingMatrix(int n) {
        int[][] array = new int[n][n];
        int j = 0;
        int a = 1;
        int b = 2;
        for (int i = 0; i < n; i++) {
            array[i][j] = a * b;
            a++;
            b++;
            j++;
        }
        return array;
    }

    private static void outputMatrix(int[][] array) {
        for (int[] x : array) {
            System.out.println(Arrays.toString(x));
        }
        System.out.println();
    }
}
