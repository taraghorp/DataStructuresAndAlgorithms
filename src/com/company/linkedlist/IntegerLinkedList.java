package com.company.linkedlist;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {
        IntegerNode valueNode = new IntegerNode(value);
        if (head == null || value < head.getValue()) {
            addToFront(value);
            size++;
            return;
        }

        IntegerNode current = head.getNext();
        IntegerNode previous = head;
        while(current != null && value > current.getValue())
        {
            previous = current;
            current = current.getNext();
        }

        valueNode.setNext(current);
        previous.setNext(valueNode);
        size++;

    }
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}

