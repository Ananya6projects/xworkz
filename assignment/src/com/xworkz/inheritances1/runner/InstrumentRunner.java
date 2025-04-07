package com.xworkz.inheritances1.runner;

import com.xworkz.inheritances1.internal.MusicalInstrument;
import com.xworkz.inheritances1.internal.Piano;
import com.xworkz.inheritances1.internal.InstrumentTester;

public class InstrumentRunner {
    public static void main(String[] args) {
        MusicalInstrument instrument1 = new MusicalInstrument();
        instrument1.turnOn();
        instrument1.operate();
        instrument1.connect();
        instrument1.performTask();
        instrument1.shutDown();

        System.out.println("-----------");

        MusicalInstrument instrument2 = new Piano();
        instrument2.turnOn();
        instrument2.operate();
        instrument2.connect();
        instrument2.performTask();
        instrument2.shutDown();

        System.out.println("-----------");

        Piano piano = new Piano();
        piano.turnOn();
        piano.operate();
        piano.connect();
        piano.performTask();
        piano.shutDown();

        System.out.println("------casting------");

        InstrumentTester tester = new InstrumentTester();
        tester.test(instrument1);
        tester.test(instrument2);
        tester.test(piano);
    }
}
