package com.company;

/**
 * Created by Администратор on 05.11.2021.
 */
public class Mother extends Granny {
    private String job;
    protected Mother(String name, int age,String job) {
        super(name, age);
        this.job=job;
    }
    @Override
    public void print() {
        System.out.println("\nname "+getName()+ "\nage "+ getAge()+"\njob "+job);
    }
}