package org.example;

public class Main {
    public static void main(String[] args) {
        Spiller spiller1 = new Menneskespiller("Spiller 1");
        Spiller spiller2 = new Computerspiller("Computer");

        Spil spil = new Spil(spiller1, spiller2);
        spil.start();
    }
}