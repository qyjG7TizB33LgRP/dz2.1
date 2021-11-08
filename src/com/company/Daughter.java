package com.company;

/**
 * Created by Администратор on 05.11.2021.
 */
public class Daughter extends Granny {
    private String kindergarten;
    protected Daughter(String name, int age,String kindergarten) {
        super(name, age);
        this.kindergarten=kindergarten;
    }
    @Override
    public void print() {
        System.out.println("\nname "+getName()+ "\nage "+ getAge()+"\nkindergarten "+kindergarten);
    }
}
