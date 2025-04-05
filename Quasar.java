package com.xworkz.inheritances1;

public class Quasar extends QuasarParent {
    @Override
    void category() { System.out.println("Child: Ultra-luminous galactic core"); }
    @Override
    void quasarEnergySource() { System.out.println("Child: Accreting black hole"); }
    @Override
    void brightestQuasar() { System.out.println("Child: Ton 618 - most massive"); }
    @Override
    void quasarRedshift() { System.out.println("Child: High redshift = ancient light"); }
    @Override
    void quasarDiscovery() { System.out.println("Child: 1963 by Maarten Schmidt"); }
}
