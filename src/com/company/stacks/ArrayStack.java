package com.company.stacks;
import com.company.linkedlist.Student;

import java.util.EmptyStackException;

public class ArrayStack
{
    private Student[] stack;
    private int top;

    public ArrayStack(int capacity){
        stack = new Student[capacity];
    }

    public void push(Student student)
    {
        if(top == stack.length)
        {
            Student[] newArray = new Student[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top] = student;
        top++;
    }

    public Student pop()
    {
        if(stack.length == 0)
        {
            throw new EmptyStackException();
        }
        Student topStudent = stack[top -1];
        top--;
        stack[top] = null;
        return topStudent;
    }

    public Student peek()
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
