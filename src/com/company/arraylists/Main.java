package com.company.arraylists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("John", "Smith", 5));
        studentList.add(new Student("Tara", "Ghorp", 7));


        System.out.println(studentList.get(1));
        Student bucky = new Student("Bucky", "Bucky",10);
        studentList.add(0, bucky);

        studentList.forEach(x -> {

            System.out.println(x.getFirstName());
        });

        System.out.println(studentList.contains(new Student("Tara", "Ghorp", 7)));
        studentList.remove(bucky);

        studentList.forEach(x -> {

            System.out.println(x.getFirstName());
        });
    }
}
