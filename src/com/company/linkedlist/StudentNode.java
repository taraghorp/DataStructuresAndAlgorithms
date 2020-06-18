package com.company.linkedlist;

public class StudentNode {
    Student student;
    StudentNode next;
    StudentNode previous;

    public StudentNode(Student student)
    {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentNode getNext() {
        return next;
    }

    public void setNext(StudentNode next) {
        this.next = next;
    }

    public String toString()
    {
        return student.toString();
    }

    public StudentNode getPrevious() {
        return previous;
    }

    public void setPrevious(StudentNode previous) {
        this.previous = previous;
    }
}
