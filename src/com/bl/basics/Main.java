package com.bl.basics;


import java.lang.reflect.Array;
import java.util.Date;

public class Main {
    byte a = 12;
    short b = 123;
    int c = 1123;
    long d = 34335454545454l;
    float e = 2.4f; // automatic double but specify f to get float
    double f = 2.4; // defalut double
    char g = 'u'; // char litral
    boolean h = true;
    String i = "hi"; //string litral


    //non premitive data type
    // class, interface
    int[] intArr = {1, 2, 3};
    //wrapper data types

    Byte j = 12;
    Short k = 2123;
    Integer l = 1234;
    Long m = 35454544l;
    Float n = 4.7f;
    Double o = 2.5454545;
    Character p = '&';
    Boolean bz = false;

    Array arrObj;
    Date date;

    static long add(int a, int b) {
        return a + b;
    }

    static boolean isEvenNumber(long l) {
        boolean ansz = l % 2 == 0;
        return ansz;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to java basics");
        //Bird parrot = new Bird();
       /* parrot.sound = "squake";
        parrot.species = "anything";
        parrot.type = "non-mamal";*/

        int sum = (int) add(2344, 454);
        System.out.println(sum);
        boolean b = isEvenNumber(45);
        System.out.println(b);

        Parrot parrot1 = new Parrot();
        parrot1.integerVar = 45;
        System.out.println("Parrot class variable " + parrot1.integerVar);
    }
}

interface IBird {

    abstract void fly();

    void swim();

    void eat();
}

abstract class Bird {

    String sound;
    String color;
    String name;
    String species;
    String type;

    abstract void eat();//hidden from client and not given the body of it.

    void fly() {

    }

    void swim() {
    }
}

class Parrot extends Bird {

    String extra;
    Integer integerVar;
    String sound;

    Parrot(String sound) {
        sound = sound;// local
        this.sound = sound;//current class - 95
        super.sound = sound;//parent class
        //sound = sound1;

    }

    void extraFun() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void eat() { //internal function
        System.out.println();
    }
}
// interface means all function abstarcted

