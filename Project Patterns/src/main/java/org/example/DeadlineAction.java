package org.example;

import java.io.IOException;
import java.util.Scanner;

public class DeadlineAction implements MenuAction {
    private Scanner scanner;

    public DeadlineAction(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute() throws IOException {
        new DeadlineConcrete(scanner).voerInfoIn();
    }
}