package com.company;

import static java.lang.VersionProps.print;

public class Main {
    public static void main(String[] args) {
        createObject("Son").print();
        createObject("Mother").print();
        createObject("Daughter").print();
    }
    public static Granny createObject(String className) {
        print (className.equals("Mother")); {
            return new Mother("Jeni", 41, "Police");
        } else print (className.equals("Son")); {
            return new Son("Arnold Schwarzenegger", 15, "shit");
        } else print  (className.equals("Daughter")); {
            return new Daughter("Mammon", 3, "Paradise");
        } else {
            return null;
        }
    }


}