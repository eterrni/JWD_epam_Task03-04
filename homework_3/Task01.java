package by.epamtc.homework_3;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {


        Random random = new Random();
        int[] array = new int[random.nextInt(10)];
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }


        System.out.print("\nArray sums of elements: ");
        int[] arraySum;

        if (array.length % 2 != 0) {
            arraySum = new int[array.length / 2 + 1];
            int j = array.length - 1;
            for (int i = 0; i != arraySum.length - 1; i++) {
                arraySum[i] = array[i] + array[j];
                j--;
            }
            arraySum[arraySum.length - 1] = array[array.length / 2];


            for (int x : arraySum) {
                System.out.print(x + " ");
            }


        } else {
            arraySum = new int[array.length / 2];
            int j = array.length - 1;
            for (int i = 0; i != j + 1; i++) {
                arraySum[i] = array[i] + array[j];
                System.out.print(arraySum[i] + " ");
                j--;
            }
        }


        int maxSum = 0;
        for (int i = 0; i < arraySum.length; i++) {
            if (maxSum < arraySum[i]) {
                maxSum = arraySum[i];
            }
        }
        System.out.println("\nMax sum:" + maxSum);

    }
}
