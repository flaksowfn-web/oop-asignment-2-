package com.example.university.people;

import com.example.university.interfaces.IStudy;


public final class Student extends Human implements IStudy {


    private final String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public void study() {
        System.out.println(name + " is studying.");
    }

    @Override
    public int getCredits() {
        return 30;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public final void showStudentId() {
        System.out.println("Student ID: " + studentId);
    }
}
