package com.tts;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota","Rav4", 2021 );

        System.out.println(car1.toString());
        boolean val = car1.isNewCar();
        System.out.println("Value: " + val);

    }
}
