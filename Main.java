package com.company;



public class Main {
    public static void Sort(int[] collection) {
        if (collection != null) {
            quickSort(collection, 0, collection.length-1);
        } else {
            throw new IllegalArgumentException("Input paramenter for array to sort is null.");
        }
    }

    private static void quickSort(int[] collection, int firstPosition, int lastPosition) {
        if (firstPosition >= lastPosition) {
            return;
        } else {
            int pivotIndex = partition(collection, firstPosition, lastPosition);
            quickSort(collection, firstPosition, pivotIndex-1);
            quickSort(collection, pivotIndex+1, lastPosition);
        }
    }

    private static int partition(int[] collection, int firstPosition, int lastPosition) {
        int pivotIndex = selectPivot(firstPosition, lastPosition);
        swap (collection, pivotIndex, lastPosition);
        int store = firstPosition;
        pivotIndex = lastPosition;
        for (int i = firstPosition; i <= lastPosition-1 ; i++) {
            if (collection[i] <= collection[pivotIndex]) {
                swap (collection, i, store);
                store++;
            }
        }
        swap (collection, store, pivotIndex);
        pivotIndex = store;
        return pivotIndex;
    }

    private static void swap(int[] collection, int x, int y) {
        int temp = collection[x];
        collection[x] = collection[y];
        collection[y] = temp;
    }

    private static int selectPivot(int first, int last) {
        return (first+last)/2;
    }

    public static void MassiveOut(int[][] myArray)
    {
        for (int i = 0; i<myArray.length; i++){
            for (int j = 0; j<myArray[1].length; j++){
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] myArray = new int[5][10];
        for (int i =0; i<myArray.length; i++){
            for (int j =0; j<myArray[1].length; j++){
                myArray[i][j]=(int)(10*Math.random());
            }
        }
        MassiveOut(myArray);
        for (int i =0; i<myArray.length; i++) {
            Sort(myArray[i]);
        }
        MassiveOut(myArray);
    }
}
