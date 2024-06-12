package org.example;

import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import static java.nio.file.Files.readAllLines;
import static java.nio.file.Files.write;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Rapportage {
    private Scanner scanner;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Rapportage(Scanner scanner) {
        this.scanner = scanner;
    }

    public void voerInfoIn() throws IOException {
        String[] files = {"deadline.csv", "project.csv", "toets.csv"};
        LocalDate vandaag = LocalDate.now();

        for (String file : files) {
            List<String> regels = readAllLines(Paths.get(file));
            List<String> updatedLines = new ArrayList<>();

            for (String regel : regels) {
                String[] parts = regel.split(",");
                LocalDate datum = LocalDate.parse(parts[1], formatter);
                if (!datum.isAfter(vandaag)) {
                    String status = parts.length > 3 ? parts[3] : "";
                    if (status.isEmpty()) {
                        System.out.println(parts[0] + ", gehaald of niet gehaald?");
                        String gehaald = scanner.nextLine();
                        regel += "," + gehaald;
                    }
                }
                updatedLines.add(regel);             }

            write(Paths.get(file), updatedLines, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
            for (String line : updatedLines) {
                System.out.println(line);
            }
        }
    }
}