package com.xworkz.tostring.Hierarchichal;

public class Employee {
    void work() {
        System.out.println("Employee working");
    }
}

class Developer extends Employee {
    void code() {
        System.out.println("Developer coding");
    }
}

class Tester extends Employee {
    void test() {
        System.out.println("Tester testing");
    }
}
