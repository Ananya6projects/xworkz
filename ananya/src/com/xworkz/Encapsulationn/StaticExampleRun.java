package com.xworkz.Encapsulationn;

public class StaticExampleRun {
        public static void main(String[] args) {
            StaticExample obj1 = new StaticExample();
            StaticExample obj2 = new StaticExample();

            obj1.display();
            obj2.display();

            StaticExample.companyName = "Infosys";
            obj1.display();
            obj2.display();
        }
    }


