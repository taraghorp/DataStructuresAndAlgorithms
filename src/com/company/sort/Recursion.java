package com.company.sort;

public class Recursion {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        System.out.println(r.recursiveFactorial(10));
    }

    public int recursiveFactorial(int num)
    {
        if(num == 0)
        {
            return 1;
        }
        return num * recursiveFactorial(num-1);
    }

}
