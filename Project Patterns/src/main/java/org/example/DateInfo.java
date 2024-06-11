package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateInfo {
    private LocalDate date;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public DateInfo(String dateStr) {
        this.date = LocalDate.parse(dateStr, formatter);
    }

    public String formatDate() {
        return date.format(formatter);
    }

    public LocalDate getDate() {
        return date;
    }
}
