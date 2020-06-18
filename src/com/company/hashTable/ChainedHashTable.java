package com.company.hashTable;

import java.util.LinkedList;
import java.util.ListIterator;

import com.company.linkedlist.Student;

public class ChainedHashTable
{
    //making an array of linked lists called 'hashtable'
    private LinkedList<StoredStudent> [] hashtable;

    public ChainedHashTable()
    {
        hashtable = new LinkedList[10];
        //creating an instance of linked list in each position
        for(int i = 0; i < hashtable.length;i++)
        {
            hashtable[i] = new LinkedList<StoredStudent>();
        }
    }

    public int hashKey(String key)
    {
        return key.length() % hashtable.length;
    }

    //adds student by finding the hashedkey, then adding the new stored student to the correct position
    //in the hashtable array
    public void put(String key, Student student)
    {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredStudent(key, student));
    }

    //gets the student by iterating over the list, finding the correct student-key pair
    //then returning the student from the stored student
    public Student get(String key)
    {
        int hashedKey = hashKey(key);
        ListIterator <StoredStudent> iterator = hashtable[hashedKey].listIterator();
        StoredStudent student = null;
        while(iterator.hasNext())
        {
            student = iterator.next();
            if(student.key.equals(key))
            {
                return student.student;
            }
        }
        return null;
    }

    //removes student in linked list by: iterating over list to find the correct student-key pair
    //then removing it from the list
    public Student remove(String key)
    {
        int hashedKey = hashKey(key);
        ListIterator <StoredStudent> iterator = hashtable[hashedKey].listIterator();
        StoredStudent student = null;
        int index = -1;
        while(iterator.hasNext())
        {
            student = iterator.next();
            index++;
            if(student.key.equals(key))
            {
                break;
            }

        }
        if(student == null)
        {
            return null;
        }
        else
        {
            hashtable[hashedKey].remove(index);
            return student.student;
        }

    }

    public void printHashTable()
    {
        for(int i = 0; i < hashtable.length; i++){
            if(hashtable[i].isEmpty())
            {
                System.out.println("Position: "+ i + " is empty");
            }
            else
            {
                System.out.println("Position: "+ i + " ");
                ListIterator <StoredStudent> iterator = hashtable[i].listIterator();
                while(iterator.hasNext())
                {
                    System.out.print(iterator.next().student);
                    System.out.print("->");
                }
                System.out.println("null");
            }
        }
    }


}
