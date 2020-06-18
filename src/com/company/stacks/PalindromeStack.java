package com.company.stacks;

import com.company.linkedlist.Student;

import java.util.EmptyStackException;

public class PalindromeStack {
    private char[] stack;
    private int top;

    public PalindromeStack(int capacity){
        stack = new char[capacity];
    }

    public void push(char c)
    {
        if(top == stack.length)
        {
            char[] newC = new char[2 * stack.length];
            System.arraycopy(stack, 0, newC, 0, stack.length);
            stack = newC;
        }
        stack[top] = c;
        top++;
    }

    public char pop()
    {
        if(stack.length == 0)
        {
            throw new EmptyStackException();
        }
        char topC = stack[top -1];
        top--;
        stack[top] = '\0';
        return topC;
    }

    public char peek()
    {
        if(stack.length == 0)
        {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public void printStack()
    {
        for(int i = top -1; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }


}
