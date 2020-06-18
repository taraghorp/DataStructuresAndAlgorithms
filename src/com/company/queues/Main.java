package com.company.queues;

import com.company.linkedlist.Student;

public class Main {
    public static void main(String[] args) {
        Student a = new Student("Tara", "Ghorp", 18);
        Student b = new Student("Bucky", "Bucky", 10);
        Student c = new Student("John", "Wilson", 99);
        Student d = new Student("Bobby", "Boy", 555);
        Student e = new Student("Tom", "Tom", 45);
        Student coolchad = new Student("Cool", "Chad", 108);

        ArrayQueue queue = new ArrayQueue(4);

        queue.add(a);
        queue.add(b);
        queue.remove();
        queue.add(c);
        queue.remove();
        queue.add(d);
        queue.remove();
        queue.add(e);
        queue.remove();
        queue.add(a);

        queue.printQueue();
        //queue.add(tomtom);
        //queue.add(coolchad);

        //queue.printQueue();

        //queue.remove();
        //queue.remove();

        //queue.printQueue();

        //System.out.println(queue.peek());

        //queue.printQueue();

    }
}
