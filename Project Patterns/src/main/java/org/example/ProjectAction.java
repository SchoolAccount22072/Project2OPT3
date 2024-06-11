package org.example;

import java.io.IOException;
import java.util.Scanner;

public class ProjectAction implements MenuAction {
    private Scanner scanner;

    public ProjectAction(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute() throws IOException {
        new Project(scanner).voerInfoIn();
    }
}
