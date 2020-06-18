package com.company.queues;
import com.company.linkedlist.Student;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

public class ArrayQueue {

    private Student[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity)
    {
        queue = new Student[capacity];
    }

    public void add(Student student)
    {
        /*if(back == queue.length)
        {
            Student[] newArray = new Student[2 * queue.length];
            System.arraycopy(queue,0,newArray,0,queue.length);
        }
        queue[back] = student;
        back ++;*/
        int size = size();
        int queueLength = queue.length;
        if(size == queueLength - 1)
        {
            System.out.println("Inside");
            int numItems = size();
            Student[] newArray = new Student[2 * queueLength];

            System.arraycopy(queue,front, newArray, 0,queueLength - front);
            System.arraycopy(queue, 0, newArray, queueLength - front, back);

            queue = newArray;

            front = 0;
            back = numItems;


        }
        queue[back] = student;
        if (back < queueLength - 1) {
            back++;
        }
        else {
            back = 0;
        }
    }

    public Student remove()
    {
        if(size() == 0)
        {
            throw new NoSuchElementException();
        }
        Student student = queue[front];
        queue[front] = null;
        front++;
        if(size() == 0)
        {
            front = 0;
            back = 0;
        }
        else if(front == queue.length)
        {
            front = 0;
        }
        return student;
    }

    public Student peek()
    {
        return queue[front];
    }

    public int size()
    {
        if (front <= back) {
            return back - front;
        }
        else {
            return back - front + queue.length;
        }
    }

   public void printQueue()
   {
       for(int i = front; i < back; i++)
       {
           System.out.println(queue[i]);
       }
   }

}
