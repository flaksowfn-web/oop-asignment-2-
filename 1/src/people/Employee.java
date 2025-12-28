package com.example.university.people;

import com.example.university.interfaces.IStudy;
import com.example.university.interfaces.IWork;

public class Employee extends Human implements IStudy, IWork {

    private double hourlyRate;
    private int hoursWorked;

    public Employee(String name, int age, double hourlyRate, int hoursWorked) {
        super(name, age);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void study() {
        System.out.println(name + " is studying for professional development.");
    }

    @Override
    public int getCredits() {
        return 10;
    }

    @Override
    public void work() {
        System.out.println(name + " is working.");
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getRole() {
        return "Employee";
    }
}
