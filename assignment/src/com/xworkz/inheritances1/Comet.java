package com.xworkz.inheritances1;

public class Comet extends CometParent {

    @Override
    void category() {
        System.out.println("Category: Icy celestial object that develops a glowing coma and tail.");
    }

    @Override
    void famousComet() {
        System.out.println("Famous Comet: Halley's Comet - visible from Earth every 76 years.");
    }

    @Override
    void cometTailFormation() {
        System.out.println("Tail Formation: Solar radiation and solar wind cause sublimation of ice.");
    }

    @Override
    void cometOrbit() {
        System.out.println("Orbit: Follows long elliptical paths around the Sun.");
    }

    @Override
    void cometComposition() {
        System.out.println("Composition: Frozen gases, dust, and rocky particles.");
    }
}
