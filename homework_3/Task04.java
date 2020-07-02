package by.epamtc.homework_3;

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {

        int currentCounter = 0;
        int biggestCounter = 0;
        int frequentElement = 0;


        Random random = new Random();
        int[] array = new int[random.nextInt(20)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }


        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    currentCounter++;
                }
            }

            if (currentCounter > biggestCounter) {
                biggestCounter = currentCounter;
                frequentElement = array[i];
            }

            if (currentCounter == biggestCounter) {
                if (array[i] < frequentElement) {
                    frequentElement = array[i];
                }
            }

            currentCounter = 0;
        }

        System.out.println("\nЭлемент:" + frequentElement + " Число повторений:" + biggestCounter);
    }
}
