package com.xworkz.Encapsulationn;

public class Person1Runner {
    public static void main(String[] args) {
        Person1 p = new Person1();


        p.setName("Ananya");
        p.setAge(20);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}

