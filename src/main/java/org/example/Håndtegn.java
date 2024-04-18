package org.example;

enum Håndtegn {
    STEN("Sten"), SAKS("Saks"), PAPIR("Papir");

    private final String displayName;

    Håndtegn(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
