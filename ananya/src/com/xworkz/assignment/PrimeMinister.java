package com.xworkz.assignment;
public class PrimeMinister {
    String name;
    int age;
    int termYears;
    Minister minister1 = new Minister("roy","Home");
    Minister minister2 = new Minister("shyam", "Foreign Affairs");
    Minister minister3 = new Minister("abhi", "Justice");
    Minister minister4 = new Minister("john", "Health");
    Minister minister5 = new Minister("kush", " Defense");
    Minister[] ministers = {minister1, minister2, minister3, minister4, minister5};

    PrimeMinister(String name, int age, int termYears){
        this.name = name;
        this.age = age;
        this.termYears = termYears;
    }
    void display(){
        System.out.println("The PrimeMinister name is : "+this.name);
        System.out.println("The PrimeMinister age is : "+this.age);
        System.out.println("The PrimeMinister termYears is :"+this.termYears);

        for(Minister minister : ministers){
            System.out.println("The Minister name is : "+minister.name);
            System.out.println("The Minister ministery is : "+minister.ministry);
            minister.display();
        }

    }
}

