//14. Написать программу, сортирующую строки двумерного массива цифр по возрастанию
package com.company;
import java.util.Random;

public class Main {
    public static void Sort(int[][] arr) {             // Сортировка
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i][j] > arr[i][k]) {
                        int b = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = b;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int size = rand.nextInt(2, 5);
        int[][] Array = new int[size][size];            // Генерация двумерного массива и заполнение его рандомными числами
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                Array[i][j] = rand.nextInt(10);

            }
        }

        for (int[] ints : Array) {
            for (int j = 0; j < Array.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nПосле:");


        Sort(Array);
        for (int[] ints : Array) {
            for (int j = 0; j < Array.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
