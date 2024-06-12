package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Toets extends Deadline {
    private String toetstijd;
    private String toetsstof;
    private String toetslocatie;
    private String toetsbeschrijving;

    public Toets(Scanner scanner) {
        super(scanner);
        this.bestand = "toets.csv";
    }

    @Override
    protected void voerNaamIn() {
        System.out.println("Voer de toetsnaam in:");
        naam = scanner.nextLine();
    }

    @Override
    protected void voerSpecifiekeInfoIn() {
        System.out.println("Voer de toetstijd in:");
        toetstijd = scanner.nextLine();
        System.out.println("Voer de toetsstof in:");
        toetsstof = scanner.nextLine();
        System.out.println("Voer de toetslocatie in:");
        toetslocatie = scanner.nextLine();
        System.out.println("Voer de toetsbeschrijving in:");
        toetsbeschrijving = scanner.nextLine();
    }

    @Override
    protected void schrijfNaarBestand() throws IOException {
        String nieuweRegel = String.format("%s,%s,%s,%s,%s,%s,%s\n",
                naam,
                datum.formatDate(),
                extraInformatie,
                toetstijd,
                toetsstof,
                toetslocatie,
                toetsbeschrijving);
        Files.write(Paths.get(bestand), nieuweRegel.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        System.out.println("Toets informatie toegevoegd aan " + bestand);
    }
}
