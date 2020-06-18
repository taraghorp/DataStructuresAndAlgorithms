package com.company.sort;

import java.util.*;

public class BucketSort
{
    List<Integer>[] buckets;

    public BucketSort()
    {
        buckets = new List[10];
        for(int i = 0; i < buckets.length; i++)
        {
            buckets[i] = new ArrayList<Integer>();
        }
    }

    public void sort(int[] input)
    {
        for(int i = 0; i < input.length; i++)
        {
            buckets[hash(input[i])].add(input[i]);
        }

        for(List bucket: buckets)
        {
            Collections.sort(bucket);
        }

        int j = 0;
        for(int i = 0; i < buckets.length; i++)
        {
            for(int value: buckets[i])
            {
                input[j++] = value;
            }
        }

        Util.printArray(input);
    }
    public int hash(int value)
    {
        return value/10;
    }

}
