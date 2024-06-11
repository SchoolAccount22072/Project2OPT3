package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Project extends Deadline {
    private int groepsgrootte;
    private String projectOnderwerp;
    private String projectBeschrijving;

    public Project(Scanner scanner) {
        super(scanner);
        this.bestand = "project.csv";
    }

    @Override
    protected void voerNaamIn() {
        System.out.println("Voer de projectnaam in:");
        naam = scanner.nextLine();
    }

    @Override
    protected void voerSpecifiekeInfoIn() {
        System.out.println("Voer de groepsgrootte in:");
        groepsgrootte = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Voer het projectonderwerp in:");
        projectOnderwerp = scanner.nextLine();

        System.out.println("Voer de projectbeschrijving in:");
        projectBeschrijving = scanner.nextLine();
    }

    @Override
    protected void schrijfNaarBestand() throws IOException {
        String nieuweRegel = String.format("%s,%s,%s,%d,%s,%s\n",
                naam,
                datum.formatDate(),
                extraInformatie,
                groepsgrootte,
                projectOnderwerp,
                projectBeschrijving);
        Files.write(Paths.get(bestand), nieuweRegel.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        System.out.println("Projectinformatie toegevoegd aan " + bestand);
    }
}
