package org.example;

class Spil {
    private Spiller spiller1;
    private Spiller spiller2;

    public Spil(Spiller spiller1, Spiller spiller2) {
        this.spiller1 = spiller1;
        this.spiller2 = spiller2;
    }

    public void start() {
        System.out.println("Velkommen til spillet!");
        int runder = 0;
        int uafgjort = 0;

        while (runder < 3) {
            runder++;
            System.out.println("Runde " + runder + ":");

            Håndtegn håndtegn1 = spiller1.vælgHåndtegn();
            Håndtegn håndtegn2 = spiller2.vælgHåndtegn();

            System.out.println(spiller1.getNavn() + " valgte: " + håndtegn1);
            System.out.println(spiller2.getNavn() + " valgte: " + håndtegn2);

            int resultat = sammenlignHåndtegn(håndtegn1, håndtegn2);
            if (resultat == 0) {
                System.out.println("Uafgjort!");
                uafgjort++;
                runder--;
            } else if (resultat == 1) {
                System.out.println(spiller1.getNavn() + " vinder!");
                spiller1.tælPointOp();
            } else {
                System.out.println(spiller2.getNavn() + " vinder!");
                spiller2.tælPointOp();
            }

            System.out.println();
        }

        if (spiller1.getPoints() > spiller2.getPoints()) {
            System.out.println(spiller1.getNavn() + " vinder spillet!");
        } else if (spiller1.getPoints() < spiller2.getPoints()) {
            System.out.println(spiller2.getNavn() + " vinder spillet!");
        } else {
            System.out.println("Spillet endte uafgjort.");
        }
    }

    private int sammenlignHåndtegn(Håndtegn håndtegn1, Håndtegn håndtegn2) {
        if (håndtegn1 == håndtegn2) {
            return 0;
        } else if ((håndtegn1 == Håndtegn.STEN && håndtegn2 == Håndtegn.SAKS) ||
                (håndtegn1 == Håndtegn.PAPIR && håndtegn2 == Håndtegn.STEN) ||
                (håndtegn1 == Håndtegn.SAKS && håndtegn2 == Håndtegn.PAPIR)) {
            return 1;
        } else {
            return 2;
        }
    }
}
