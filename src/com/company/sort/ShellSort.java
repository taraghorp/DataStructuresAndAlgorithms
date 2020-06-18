package com.company.sort;

public class ShellSort {
    int[] intArray;
    String[] args;
    public ShellSort(int[] intArray, String[] args)
    {
        this.intArray = intArray;
        this.args = args;
    }

    public void sort()
    {
        for(int gap = intArray.length/2; gap > 0; gap /= 2)
        {
            for(int i = gap; i < intArray.length; i++)
            {
                int newElement = intArray[i];
                int j = i;

                while(j >= gap && intArray[j-gap] > newElement)
                {
                    intArray[j] = intArray[j-gap];
                    j -= gap;
                }
                intArray[j] = newElement;

            }

        }
        Util.printArray(intArray);
    }
}
