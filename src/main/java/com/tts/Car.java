package com.tts;

public class Car {
    private String make;
    private String model;
    private int manufacturingYear;
    // // Empty constructor
    public Car() {
        this.make = "";
        this.model = "";
        this.manufacturingYear = 0;
    }
    // // Constructor uses 2 variable
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        manufacturingYear = 2010;
    }
    // // Constructor uses 3 variables
    public Car(String make, String model, int manufacturingYear) {
        this.make = make;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
    }
    // // Get and set methods
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getManufacturingYear() {
        return manufacturingYear;
    }
    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }
// // Method to return a string
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                '}';
    }
    // // Method returns a boolean
    public boolean isNewCar() {
        return manufacturingYear >= 2020;
    }

}
