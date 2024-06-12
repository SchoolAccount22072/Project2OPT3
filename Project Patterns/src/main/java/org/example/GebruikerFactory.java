package org.example;

import java.util.Scanner;

public class GebruikerFactory {
    public Gebruiker createGebruiker(Scanner scanner) {
        System.out.println("Kies gebruiker:");
        System.out.println("1. Student (Mike)");
        System.out.println("2. Docent (Marcel)");
        int userChoice = scanner.nextInt();
        scanner.nextLine();

        switch (userChoice) {
            case 1:
                System.out.println("Welkom Mike!");
                return new Student();
            case 2:
                System.out.println("Welkom Marcel!");
                return new Docent();
            default:
                return null;
        }
    }
}