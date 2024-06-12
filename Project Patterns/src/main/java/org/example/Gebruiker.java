package org.example;

import java.util.Scanner;

public abstract class Gebruiker {
    public String naam;
    public String baan;
    public int leeftijd;
    public String studienaam;

    abstract Menu createMenu(Scanner scanner);
}