package com.example.university;

import com.example.university.interfaces.IStudy;
import com.example.university.interfaces.IWork;
import com.example.university.people.Employee;
import com.example.university.people.Human;
import com.example.university.people.Student;

public class Main {
    public static void main(String[] args) {


        Human student1 = new Student("Alice", 20, "S123");
        Student student2 = new Student("Bob", 22, "S456");

        Human employee1 = new Employee("John", 35, 25.5, 160);
        IWork employee2 = new Employee("Emma", 30, 30.0, 150);
        IStudy employee3 = new Employee("Mike", 40, 28.0, 170);



        student1.introduce();
        System.out.println(student1.getRole());

        student2.study();
        student2.showStudentId();
        System.out.println("Credits: " + student2.getCredits());

        employee1.introduce();
        System.out.println(employee1.getRole());

        employee2.work();
        System.out.println("Salary: " + employee2.calculateSalary());

        employee3.study();
        System.out.println("Credits: " + employee3.getCredits());
    }
}
