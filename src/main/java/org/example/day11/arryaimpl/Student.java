package org.example.day11.arryaimpl;

/**
 * @author Bibash Bogati
 * @created 2025-04-20
 */
public class Student {


    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public Student(String name) {
//        this.name = name;
//        this.age = age;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
