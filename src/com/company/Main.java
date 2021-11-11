package com.company;



public class Main {
    public static void main(String[] args) {
        createObject("Son").print();
        createObject("Mother").print();
        createObject("Daughter").print();
    }
    public static Granny createObject(String className) {
        switch (className){
            case "Mother":
                Mother mother = new Mother("Jeni", 41, "police");
                return mother;
            case "Daughter":
                Daughter daughter = new Daughter("Loli", 4, "heaven");
                return daughter;
            case "Son":
                Son son = new Son("Ari", 8, "colony");
                return son;
        }
        return null;
    }


}