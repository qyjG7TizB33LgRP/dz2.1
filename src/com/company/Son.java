package com.company;

/**
 * Created by Администратор on 05.11.2021.
 */
public class Son extends Granny {
    private String school;
    protected Son(String name, int age,String school) {
        super(name, age);
        this.school=school;
    }
    @Override
    public void print() {
        System.out.println("\nname "+getName()+ "\nage "+ getAge()+" \nschool "+school);
    }
}
