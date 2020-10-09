package com.codegym;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCars;

    public Car(String name, String engien){
        this.name = name;
        this.engine = engien;
        numberOfCars++;
    }
}
