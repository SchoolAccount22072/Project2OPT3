
package org.example;

import java.util.Scanner;

public class DeadlineConcrete extends Deadline {
    public DeadlineConcrete(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void voerNaamIn() {
        System.out.println("Voer de deadlinenaam in:");
        naam = scanner.nextLine();
    }

    @Override
    protected void voerSpecifiekeInfoIn() {
    }
}