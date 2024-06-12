package org.example;

import java.io.IOException;
import java.util.Scanner;

public class RapportageAction implements MenuAction {
    private Scanner scanner;

    public RapportageAction(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute() throws IOException {
        new Rapportage(scanner).voerInfoIn();
    }
}