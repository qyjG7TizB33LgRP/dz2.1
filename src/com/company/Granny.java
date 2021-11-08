package com.company;

public abstract class Granny implements Printable{
    private String name;
    private int age;
    protected Granny(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}