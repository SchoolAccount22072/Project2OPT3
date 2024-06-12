package org.example;

import java.util.Scanner;

public class Docent extends Gebruiker {
    public Docent() {
        this.naam = "Marcel";
        this.baan = "Docent";
        this.leeftijd = 40;
        this.studienaam = null;
    }

    @Override
    Menu createMenu(Scanner scanner) {
        return new Menu(scanner);
    }
}