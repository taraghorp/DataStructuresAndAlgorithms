package com.company.linkedlist;

public class StudentLinkedList {
    StudentNode head;

    public void addToFront(Student student)
    {
        StudentNode node = new StudentNode(student);
        node.setNext(head);
        head = node;
    }

    public void printLinkedList()
    {
       StudentNode current = head;
       while(current != null)
       {
           System.out.println(current);
           current = current.getNext();
       }
    }
}
