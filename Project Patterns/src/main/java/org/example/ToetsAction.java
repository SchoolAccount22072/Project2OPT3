package org.example;

import java.io.IOException;
import java.util.Scanner;

public class ToetsAction implements MenuAction {
    private Scanner scanner;

    public ToetsAction(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute() throws IOException {
        new Toets(scanner).voerInfoIn();
    }
}

