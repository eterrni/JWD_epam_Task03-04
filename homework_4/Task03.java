package by.epamtc.homework_4;

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        int[][] array = fillingMatrix(5);
        outputMatrix(array);
    }

    public static int[][] fillingMatrix(int n) {
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            int indent = i + 1;

            if (i < n / 2) {
                while (indent <= (n - i)) {
                    array[i][n - indent] = 1;
                    indent++;
                }
            } else {
                while (indent >= (n - i)) {
                    array[i][n - indent] = 1;
                    indent--;
                }
            }
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
