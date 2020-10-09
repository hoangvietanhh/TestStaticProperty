package com.codegym;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("mazda3", "skyative3");
        Car car2 = new Car("mazda6","skyative6");
        Car car3 = new Car("mazda6","skyative6");
        Car car4 = new Car("mazda6","skyative6");
        System.out.println(Car.numberOfCars);
    }
}
