package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        GebruikerFactory gebruikerFactory = new GebruikerFactory();
        Gebruiker currentGebruiker = gebruikerFactory.createGebruiker(scanner);

        if (currentGebruiker == null) {
            System.out.println("Ongeldige keuze. Probeer opnieuw.");
            return;
        }

        Menu menu = currentGebruiker.createMenu(scanner);
        menu.startApp();
    }
}