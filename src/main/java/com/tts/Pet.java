package com.tts;

public class Pet {
// // Variables
    private String name;
    private int age;
    private String location;
    private String type;
// // Constructor
    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }
// // Get Method
    public String getName() {
        return name;
    }
// // Set Method
    public void setName(String name) {
        this.name = name;
    }
    // // Get Method
    public int getAge() {
        return age;
    }
    // // Set Method
    public void setAge(int age) {
        this.age = age;
    }
    // // Get Method
    public String getLocation() {
        return location;
    }
    // // Set Method
    public void setLocation(String location) {
        this.location = location;
    }
    // // Get Method
    public String getType() {
        return type;
    }
    // // Set Method
    public void setType(String type) {
        this.type = type;
    }

    public Pet() {

    }

}
