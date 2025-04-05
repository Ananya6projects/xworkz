package com.xworkz.inheritances1;

public class ShavingCream extends ShavingCreamParent {

        void category() {
            System.out.println("ShavingCreamChild: Updated Grooming Category");
        }

        @Override
        void keyIngredient() {
            System.out.println("ShavingCreamChild: Aloe Vera & Chamomile");
        }

        @Override
        void benefits() {
            System.out.println("ShavingCreamChild: Smoothens and refreshes skin");
        }

        @Override
        void usage() {
            System.out.println("ShavingCreamChild: Use before shaving for best results");
        }

        @Override
        void brands() {
            System.out.println("ShavingCreamChild: Gillette, Park Avenue");
        }
    }
