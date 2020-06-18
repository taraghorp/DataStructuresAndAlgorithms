package com.company.stacks;

import com.company.linkedlist.Student;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Student taraghorp = new Student("Tara", "Ghorp", 18);
        Student buckybucky = new Student("Bucky", "Bucky", 10);
        Student johnwilson = new Student("John", "Wilson", 99);
        Student bobbyboy = new Student("Bobby", "Boy", 555);
        Student tomtom = new Student("Tom", "Tom", 45);
        Student coolchad = new Student("Cool", "Chad", 108);
        /*ArrayStack stack = new ArrayStack(5);
        stack.push(taraghorp);
        stack.push(buckybucky);
        stack.push(johnwilson);
        stack.push(bobbyboy);
        stack.push(tomtom);

        stack.pop();

        stack.push(coolchad);

        Student topStudent = stack.peek();
        System.out.println(topStudent);*/
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));

    }

    public static boolean checkForPalindrome(String input)
    {
        //ArrayStack front;
        StringBuilder sb = new StringBuilder();
        for (char s : input.toCharArray())
        {
            if((((int) s) >= 65 && ((int) s) <= 90) || (((int)s) >= 97 && ((int)s) <= 122))
            {
                sb.append(s);
            }
        }
        String newInput = sb.toString();
        newInput = newInput.toLowerCase();
        System.out.println(newInput);
        PalindromeStack palstack = new PalindromeStack(newInput.length());
        String newInputRev = sb.reverse().toString();
        newInputRev = newInputRev.toLowerCase();
        System.out.println(newInputRev);
        PalindromeStack revpalstack = new PalindromeStack(newInputRev.length());
        boolean check = true;
        for(char s: newInput.toCharArray())
        {
            palstack.push(s);
        }

        for(char s: newInputRev.toCharArray())
        {
            revpalstack.push(s);
        }

        for(int i = 0; i < newInput.length(); i++)
        {
            if(palstack.pop() != revpalstack.pop())
            {
                check = false;
                break;
            }
        }


        return check;
    }

}
