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
        Project project = new Project(scanner);
        project.voerInfoIn();
        System.out.println("Groepsgrootte: " + project.getGroepsgrootte());
    }
}