package Handling;

import java.awt.*;

public abstract class Human {
    private String name;
    private int age;
    private COMPLEXION color;
    private String phoneNumber;
    private String email;
    private Address address;

    public Human(String name, int age, COMPLEXION color,
                 String phoneNumber, String email, Address address) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public Human() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public COMPLEXION getColor() {
        return color;
    }

    public void setColor(COMPLEXION color) {
        this.color = color;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public abstract String displayName();

}
