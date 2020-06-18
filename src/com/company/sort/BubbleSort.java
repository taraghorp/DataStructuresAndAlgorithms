package com.company.sort;

public class BubbleSort {
    int[] intArray;
    String[] args;
    public BubbleSort(int[] intArray, String[] args)
    {
        this.intArray = intArray;
        this.args = args;
    }
    public void sort()
    {
        String direction = args[0];
        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex --)
        {
            for(int j = 0; j<lastUnsortedIndex; j++)
            {
                if(direction.equals("a"))
                {
                    if(intArray[j]>intArray[j+1])
                    {
                        Util.swap(intArray, j, j+1);
                    }
                }
                else if(direction.equals("d"))
                {
                    if(intArray[j]<intArray[j+1])
                    {
                        Util.swap(intArray, j, j+1);
                    }
                }

            }
        }
        Util.printArray(intArray);
    }

}
