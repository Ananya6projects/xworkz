package com.xworkz.tostring.Hybrid;

interface ArtTool {
    void sketch();
}
public class Computer {
    void process() {
        System.out.println("Computer processing data");
    }
}

class GraphicTablet extends Computer implements ArtTool {
    public void sketch() {
        System.out.println("GraphicTablet sketching drawing");
    }
}
