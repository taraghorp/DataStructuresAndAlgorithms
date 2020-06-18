package com.company.linkedlist;

public class StudentDoubleLinkedList {
    StudentNode head;
    StudentNode tail;
    private int size;
    StudentNode removedNode;

    public void addToFront(Student student) {
        StudentNode node = new StudentNode(student);
        node.setNext(head);
        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
        }
        size++;
        head = node;

    }

    public void addToEnd(Student student) {
        StudentNode node = new StudentNode(student);
        if (tail == null) {
            head = node;
        } else {
            node.setNext(tail.getNext());
            node.setPrevious(tail);
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    public StudentNode removeFromFront() {
        if (head == null) {
            return null;
        } else {
            removedNode = head;
            head = head.getNext();
            head.setPrevious(null);
        }
        return removedNode;
    }

    public StudentNode removeFromTail() {
        if (tail == null) {
            return null;
        } else {
            removedNode = tail;
            tail = tail.getPrevious();
            tail.setNext(null);
        }
        return removedNode;
    }

    public void addBefore(Student oldStudent, Student newStudent) {
        StudentNode newS = new StudentNode(newStudent);
        StudentNode current = head;
        while (current != null) {
            if (current.getStudent().equals(oldStudent)) {
                if(current == head)
                {
                    head = newS;
                }
                else
                {
                    StudentNode ref = current.getPrevious();
                    newS.setPrevious(ref);
                    ref.setNext(newS);
                }
                newS.setNext(current);
                current.setPrevious(newS);
                size++;

            }
                current = current.getNext();
        }
    }

    public void printLinkedList() {
        StudentNode current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}