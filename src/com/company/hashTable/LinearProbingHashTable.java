package com.company.hashTable;

import com.company.linkedlist.Student;

public class LinearProbingHashTable {
    private StoredStudent[] hashtable;

    public LinearProbingHashTable()
    {
        hashtable = new StoredStudent[10];
    }

    public void add(String key, Student student)
    {
        int hashedKey = hashKey(key);
        if(occupied(hashedKey))
        {
            int stopIndex = hashedKey;
            if(hashedKey == hashtable.length -1)
            {
                hashedKey = 0;
            }
            else
            {
                hashedKey++;
            }
            while(occupied(hashedKey) && hashedKey!= stopIndex)
            {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }
        if(hashtable[hashedKey] != null)
        {
            System.out.println("There is already a value here");
        }
        else {
            hashtable[hashedKey] = new StoredStudent(key, student);
        }
    }

    public Student retrieve (String key)
    {
        int hashedKey = findKey(key);
        if(hashedKey == -1)
        {
            return null;
        }
        else
        {
            return hashtable[hashedKey].student;
        }
    }

    public Student remove(String key)
    {
        int hashedKey = findKey(key);
        if(hashedKey == -1)
        {
            return null;
        }
        Student student = hashtable[hashedKey].student;
        hashtable[hashedKey] = null;
        return student;

    }

    public int hashKey(String key)
    {
        return key.length() % hashtable.length;
    }

    public boolean occupied(int index)
    {
        return hashtable[index] != null;
    }

    public int findKey(String key)
    {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if(hashedKey == hashtable.length -1)
        {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }
        else
            return -1;

    }

    public void printHashtable()
    {
        for(int i  = 0; i < hashtable.length; i++)
        {
            if(hashtable[i] == null)
            {
                System.out.println("empty");
            }
            else
                System.out.println("Position: " + i + " " + hashtable[i].student);

        }
    }
}
