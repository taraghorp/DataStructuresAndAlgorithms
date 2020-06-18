package com.company.hashTable;

import com.company.linkedlist.Student;

public class Main
{
    public static void main(String[] args) {
        //SimpleHashTable ht = new SimpleHashTable();
        //LinearProbingHashTable ht = new LinearProbingHashTable();
        ChainedHashTable ht = new ChainedHashTable();
        Student taraghorp = new Student ("Tara", "Ghorp", 18);
        Student buckybucky = new Student ("Bucky", "Bucky", 10);
        Student johnwilson = new Student ("John", "Wilson", 99);
        Student bobbyboy = new Student ( "Bobby", "Boy", 555);
        Student tomtom = new Student ("Tom", "Tom", 45);
        Student smithy = new Student("Janet", "Smith", 56);

        ht.put("Ghorp", taraghorp);
        ht.put("Buck", buckybucky);
        ht.put("Wilson", johnwilson);
        ht.put("Bob", bobbyboy);
        ht.put("Tomtom", tomtom);
        ht.put("Smith", smithy);

        ht.printHashTable();

        ht.remove("Wilson");
        ht.remove("Bob");

        ht.get("Smith");

        ht.printHashTable();
    }
}
