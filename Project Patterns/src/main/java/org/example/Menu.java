
package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private MenuActionFactory menuActionFactory;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
        this.menuActionFactory = new MenuActionFactory(scanner);
    }

    public void startApp() throws IOException {
        System.out.println("Welkom bij de Deadline Reminder Java");
        beheerKeuzes();
    }

    private void beheerKeuzes() throws IOException {
        boolean running = true;
        while (running) {
            showMenuOptions();
            int keuze = getUserChoice();
            if (keuze == 6) {
                running = false;
                System.out.println("Applicatie wordt gesloten.");
            } else {
                executeAction(keuze);
            }
        }
    }

    private void showMenuOptions() {
        System.out.println("\nKies een optie:");
        System.out.println("1. Deadlines");
        System.out.println("2. Projecten");
        System.out.println("3. Toetsen");
        System.out.println("4. Daglijst");
        System.out.println("5. Rapportage");
        System.out.println("6. Stop de applicatie");
    }

    private int getUserChoice() {
        int keuze = scanner.nextInt();
        scanner.nextLine();
        return keuze;
    }

    private void executeAction(int keuze) throws IOException {
        MenuAction action = menuActionFactory.createMenuAction(keuze);
        if (action != null) {
            action.execute();
        } else {
            System.out.println("Ongeldige optie. Probeer opnieuw.");
        }
    }
}