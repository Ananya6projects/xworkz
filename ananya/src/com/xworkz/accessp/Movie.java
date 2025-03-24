package com.xworkz.accessp;

public class Movie {
    public String genre = "Sci-Fi";
    public String name = "Inception";
    private double rating = 9.0;

    public void showName() {
        System.out.println("Movie Genre: " + this.genre);
    }

    private void showRating() {
        System.out.println("Movie Rating: " + this.rating);
    }
}
