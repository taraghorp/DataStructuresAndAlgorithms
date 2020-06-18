package com.company.linkedlist;

public class Main {
    public static void main(String[] args) {
        Student taraghorp = new Student ("Tara", "Ghorp", 18);
        Student buckybucky = new Student ("Bucky", "Bucky", 10);
        Student johnwilson = new Student ("John", "Wilson", 99);
        Student bobbyboy = new Student ( "Bobby", "Boy", 555);
        Student tomtom = new Student ("Tom", "Tom", 45);
        //StudentLinkedList list = new StudentLinkedList();
        /*list.addToFront(johnwilson);
        list.addToFront(buckybucky);
        list.addToFront(taraghorp);

        list.printLinkedList();*/

        /*StudentDoubleLinkedList dlist = new StudentDoubleLinkedList();
        dlist.addToFront(johnwilson);
        dlist.addToFront(buckybucky);
        dlist.addToFront(taraghorp);
        dlist.printLinkedList();

        System.out.println("==========================");

        /*dlist.addToEnd(bobbyboy);
        dlist.printLinkedList();

        System.out.println("=============================");

        dlist.removeFromFront();
        dlist.printLinkedList();

        System.out.println("================================");

        dlist.removeFromTail();
        dlist.printLinkedList();*/

        /*dlist.addBefore(buckybucky, tomtom);
        dlist.printLinkedList();

        System.out.println("================================");

        dlist.addBefore(taraghorp, tomtom);
        dlist.printLinkedList();*/


        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;

        IntegerLinkedList list = new IntegerLinkedList();
        list.insertSorted(three);
        list.printList();
        list.insertSorted(two);
        list.printList();
        list.insertSorted(one);
        list.printList();
        list.insertSorted(four);
        list.printList();
    }
}
