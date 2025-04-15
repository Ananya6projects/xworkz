package com.xworkz.tostring.SingleLevel;

public class MusicDevice {
    void playMusic() {
        System.out.println("Music device playing music");
    }
}

class Radio extends MusicDevice {
    void tune() {
        System.out.println("Radio is tuning stations");
    }
}
