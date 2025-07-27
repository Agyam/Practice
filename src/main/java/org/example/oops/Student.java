package org.example.oops;

/**
 * Create a class called Student with the following:
 * Fields: name (String), rollNo (int), grade (char)
 * A method displayDetails() to print the student's details.
 * In the main method, create two Student objects with different values and call their displayDetails() method.
 */
public class Student {
    String name;
    int rollNo;
    char grade;

    public Student(String name, int rollNo, char grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    public void displayDetails(){
        System.out.println("Name        : "+this.name);
        System.out.println("Roll Number : "+this.rollNo);
        System.out.println("Grade       : "+this.grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Raja",1,'B');
        Student s2 = new Student("Harish",2,'A');
        s1.displayDetails();
        s2.displayDetails();
    }
}
