package com.company.hashTable;
import com.company.linkedlist.Student;
public class SimpleHashTable
{
    private Student[] hashtable;

    public SimpleHashTable()
    {
        hashtable = new Student[10];
    }

    public void add(String key, Student student)
    {
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null)
        {
            System.out.println("There is already a value here");
        }
        else {
            hashtable[hashedKey] = student;
        }
    }

    public Student retrieve (String key)
    {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    public int hashKey(String key)
    {
        return key.length() % hashtable.length;
    }

    public void printHashtable()
    {
        for(int i  = 0; i < hashtable.length; i++)
        {
            System.out.println(hashtable[i]);
        }
    }
}
