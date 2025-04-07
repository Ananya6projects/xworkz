 package com.xworkz.inheritances1.internal;

public class InstrumentTester {
    public void test(MusicalInstrument instrument) {
        System.out.println("Testing musical instrument...");
        instrument.turnOn();
        instrument.operate();
        instrument.connect();
        instrument.performTask();
        instrument.shutDown();

        if (instrument instanceof Piano) {
            System.out.println("Instrument is a Piano -- casting and invoking specific method");
            Piano piano = (Piano) instrument;
            piano.playChord(); // unique method
        }
    }
}

