package com.company.search;

import java.util.Collections;

public class Main
{
    public static void main(String[] args) {
        int[] intArray = new int[]{-4,0,9,12,36,97};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.iterativeBinarySearch(intArray, 97));
        System.out.println(binarySearch.recursiveBinarySearch(intArray, 12));

    }

}
