package by.epamtc.homework_3;

import java.util.Random;

public class Task05 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[random.nextInt(20)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }


        int[] arrayEvenIndex;
        if (array.length % 2 == 0) {
            arrayEvenIndex = new int[array.length / 2];
        } else arrayEvenIndex = new int[array.length / 2 + 1];
        int j = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            arrayEvenIndex[j] = array[i];
            j++;
        }


        System.out.print("\nArray even: ");
        for (int x : arrayEvenIndex) {
            System.out.print(x + " ");
        }


        int[] arrayOddIndex = new int[array.length / 2];
        int k = 0;
        for (int i = 1; i < array.length; i = i + 2) {
            arrayOddIndex[k] = array[i];
            k++;
        }


        System.out.print("\nArray odd: ");
        for (int x : arrayOddIndex) {
            System.out.print(x + " ");
        }


        int maxEvenElement = 0;
        for (int evenIndex : arrayEvenIndex) {
            if (maxEvenElement < evenIndex) {
                maxEvenElement = evenIndex;
            }
        }
        System.out.println("\nMax element of even array:" + maxEvenElement);


        int minOddElement = arrayOddIndex[0];
        for (int oddIndex : arrayOddIndex) {
            if (minOddElement > oddIndex) {
                minOddElement = oddIndex;
            }
        }
        System.out.println("Min element of odd array:" + minOddElement);


        int sum = minOddElement + maxEvenElement;
        System.out.println("Sum of this elements:" + sum);

    }
}

