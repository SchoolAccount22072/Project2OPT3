package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public abstract class Deadline {
    protected String naam;
    protected DateInfo datum;
    protected String extraInformatie;
    protected String bestand = "deadline.csv";
    protected Scanner scanner;

    public Deadline(Scanner scanner) {
        this.scanner = scanner;
    }

    // Template Method
    public final void voerInfoIn() throws IOException {
        voerNaamIn();
        voerDatumIn();
        voerExtraInfoIn();
        voerSpecifiekeInfoIn();
        schrijfNaarBestand();
    }

    protected abstract void voerNaamIn();

    protected void voerDatumIn() {
        System.out.println("Voer de datum in (dd-MM-yyyy):");
        String datumInput = scanner.nextLine();
        datum = new DateInfo(datumInput);
    }

    protected void voerExtraInfoIn() {
        System.out.println("Voer extra informatie in:");
        extraInformatie = scanner.nextLine();
    }

    protected abstract void voerSpecifiekeInfoIn();

    protected void schrijfNaarBestand() throws IOException {
        String nieuweRegel = String.join(",", naam, datum.formatDate(), extraInformatie) + "\n";
        Files.write(Paths.get(bestand), nieuweRegel.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        System.out.println(naam + " toegevoegd aan " + bestand);
    }
}
