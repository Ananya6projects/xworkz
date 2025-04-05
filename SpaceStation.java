package com.xworkz.inheritances1;

public class SpaceStation extends SpaceStationParent {
    @Override
    void category() { System.out.println("SpaceStationChild: Human Habitats in Space"); }

    @Override
    void firstSpaceStation() { System.out.println("SpaceStationChild: Salyut 1 launched by USSR"); }

    @Override
    void largestSpaceStation() { System.out.println("SpaceStationChild: ISS is multinational"); }

    @Override
    void spaceStationOrbit() { System.out.println("SpaceStationChild: 408 km above Earth"); }

    @Override
    void spaceStationPurpose() { System.out.println("SpaceStationChild: Used for space research"); }
}
