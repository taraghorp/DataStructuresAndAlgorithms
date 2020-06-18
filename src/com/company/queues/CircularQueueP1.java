package com.company.queues;
import com.company.linkedlist.Student;
import java.util.NoSuchElementException;
public class CircularQueueP1 {

    private Student[] queue;
    private int front;
    private int back;

    public CircularQueueP1(int capacity) {
        queue = new Student[capacity];
    }

    public void add(Student employee) {
        if (size() == queue.length - 1) {
            int numItems = size();
            Student[] newArray = new Student[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;

            front = 0;
            back = numItems;
        }

        // 0   jane
        // 1    john
        // 2  -   -back
        // 3  -mike - front
        // 4   -bill

        // 0 mike
        // 1 bill
        // 2 jane
        // 3 john
        // 4 - back
        // 5
        // 9


        queue[back] = employee;
        if (back < queue.length - 1) {
            back++;
        }
        else {
            back = 0;
        }
    }

    public Student remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Student employee = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return employee;
    }

    public Student peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }

}
