package by.epamtc.homework_3;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[random.nextInt(10) + 1];
        System.out.print("Array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }

        int minElement = array[0];
        for (int x : array) {
            if (minElement > x) {
                minElement = x;
            }
        }
        System.out.println("\nMin element: " + minElement);


        int amountMinimumElement = 0;
        for (int x : array) {
            if (minElement == x) {
                amountMinimumElement++;
            }
        }


        int[] arrayWithoutMinElement = new int[array.length - amountMinimumElement];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != minElement) {
                arrayWithoutMinElement[j] = array[i];
                j++;
            }
        }


        System.out.print("Array without minimal element: ");
        for(int x:arrayWithoutMinElement){
            System.out.print(x+" ");
        }
    }
}
