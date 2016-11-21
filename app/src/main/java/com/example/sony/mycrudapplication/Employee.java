package com.example.sony.mycrudapplication;

/**
 * Created by sony on 18-11-2016.
 */

public class Employee {
    private int id;
    private String name;
    private int age;
    private static int counter=1;

    private String department;
    private int num;


    public Employee( String name, int age, int num, String department) {
        this.age=age;

        this.id = counter++;
        this.name = name;
        this.department = department;
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
