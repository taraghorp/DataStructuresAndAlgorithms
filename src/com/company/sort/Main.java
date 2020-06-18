package com.company.sort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[]{12, 9, 0, -4, 97, 36};

        /*System.out.println("Bubble Sort:");
        BubbleSort bubbleSort = new BubbleSort(intArray, args);
        bubbleSort.sort();

        System.out.println("================================");

        System.out.println("Selection Sort:");
        SelectionSort selectionSort = new SelectionSort(intArray, args);
        selectionSort.sort();

        System.out.println("================================");

        System.out.println("Insertion Sort:");
        InsertionSort insertionSort = new InsertionSort(intArray, args);
        insertionSort.sort();

        System.out.println("================================");

        System.out.println("Shell Sort:");
        ShellSort shellSort = new ShellSort(intArray, args);
        shellSort.sort();*/

        System.out.println("================================");
        BucketSort bucketSort = new BucketSort();
        bucketSort.sort(intArray);

    }
}
