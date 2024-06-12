package org.example;

import java.io.IOException;
import java.util.Scanner;

public class DaglijstAction implements MenuAction {
    private Scanner scanner;

    public DaglijstAction(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute() throws IOException {
        new Daglijst(scanner).voerInfoIn();
    }
}