package com.xworkz.inheritances1.internal;

public class StoryBook extends Book {
    public StoryBook() {
        super();
        System.out.println("StoryBook --child");
    }

    @Override
    public void turnOn() {
        System.out.println("Opening the storybook to a magical page --child");
    }

    @Override
    public void operate() {
        System.out.println("Immersing in storytelling --child");
    }

    @Override
    public void connect() {
        System.out.println("Connecting to the characters' journey --child");
    }

    @Override
    public void performTask() {
        System.out.println("Evoking imagination and emotions --child");
    }

    @Override
    public void shutDown() {
        System.out.println("Ending the story with a lesson --child");
    }

    public void narrateStory() {
        System.out.println("Narrating the story to the readers...");
    }
}
