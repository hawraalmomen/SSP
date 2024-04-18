package org.example;

import java.lang.reflect.Constructor;

abstract class Spiller {
    private String navn;
    private int points;

    public Spiller(String navn) {
        this.navn = navn;
        this.points = 0;
    }

    public String getNavn() {
        return navn;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void tælPointOp() {
        points++;
    }

    public abstract Håndtegn vælgHåndtegn();
}
