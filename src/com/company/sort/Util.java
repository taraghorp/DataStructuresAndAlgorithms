package com.company.sort;

public class Util {
    public static void swap(int[] intArray, int i, int j)
    {
        if(i == j)
            return;

        /*int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;*/
        int temp = intArray[j];
        intArray[j] = intArray[i];
        intArray[i] = temp;
    }

    public static void printArray(int[] intArray)
    {
        for(int i = 0; i<intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }
    }
}
