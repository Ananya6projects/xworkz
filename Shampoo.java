package com.xworkz.inheritances1;

public class Shampoo extends ShampooParent {
    @Override
    void category() { System.out.println("Child: Cleansing hair product"); }
    @Override
    void keyIngredient() { System.out.println("Child: Tea tree oil, Biotin"); }
    @Override
    void benefits() { System.out.println("Child: Removes dandruff, strengthens"); }
    @Override
    void usage() { System.out.println("Child: Apply twice a week"); }
    @Override
    void brands() { System.out.println("Child: Tresemmé, WOW, Mamaearth"); }
}
