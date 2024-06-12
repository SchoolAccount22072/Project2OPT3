package org.example;

import java.util.Scanner;

public class Student extends Gebruiker {
    public Student() {
        this.naam = "Mike";
        this.baan = "Software Engineer";
        this.leeftijd = 21;
        this.studienaam = "Software Engineering";
    }

    @Override
    Menu createMenu(Scanner scanner) {
        return new Menu(scanner);
    }
}
