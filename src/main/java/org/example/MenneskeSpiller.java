package org.example;

import java.util.Scanner;

class Menneskespiller extends Spiller {
    public Menneskespiller(String navn) {
        super(navn);
    }

    @Override
    public Håndtegn vælgHåndtegn() {
        System.out.println("Vælg håndtegn (skriv 'sten', 'papir' eller 'saks'): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        switch (input) {
            case "sten":
                return Håndtegn.STEN;
            case "papir":
                return Håndtegn.PAPIR;
            case "saks":
                return Håndtegn.SAKS;
            default:
                System.out.println("Ugyldigt valg. Prøv igen.");
                return vælgHåndtegn();
        }
    }
}