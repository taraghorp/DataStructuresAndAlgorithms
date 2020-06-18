package com.company.sort;

public class InsertionSort {
    int[] intArray;
    String[] args;
    public InsertionSort(int[] intArray, String[] args)
    {
        this.intArray = intArray;
        this.args = args;
    }

    public void sort()
    {
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++)
        {
            int newElement = intArray[firstUnsortedIndex];
            int i;

            for(i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i --)
            {
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }

        Util.printArray(intArray);
    }
}
