package org.example;

import java.util.Random;

class Computerspiller extends Spiller {
    private Random random;

    public Computerspiller(String navn) {
        super(navn);
        random = new Random();
    }

    @Override
    public Håndtegn vælgHåndtegn() {
        int valg = random.nextInt(3);
        return Håndtegn.values()[valg];
    }
}
