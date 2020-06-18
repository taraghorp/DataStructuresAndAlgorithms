package com.company.sort;

public class SelectionSort {
    int[] intArray;
    String[] args;
    public SelectionSort(int[] intArray, String[] args)
    {
        this.intArray = intArray;
        this.args = args;
    }

    public void sort()
    {
        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {
            int largest = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++)
            {
                if(intArray[i] > intArray[largest])
                {
                    largest = i;
                }
            }
            Util.swap(intArray, largest, lastUnsortedIndex);
        }

        Util.printArray(intArray);

    }

}
