package com.fundamentals;

public class House {
    String entranceDoorColor;
    String foundationType;
    String roofStyle;
    int totalWindows;

    public void doorFunction() {
        System.out.println("This door opens");
    }

    public static void main(String[] args) {
        House myhouse = new House();
        myhouse.doorFunction();
        myhouse.entranceDoorColor = "Red";
        myhouse.foundationType = "Concrete";
        myhouse.roofStyle ="Shingle";
        myhouse.totalWindows = 30;
        System.out.println(myhouse.foundationType);
    }

}
