package com.example.university.people;

public abstract class Human {


    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }


    public abstract String getRole();
}
