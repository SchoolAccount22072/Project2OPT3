package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuActionFactory {
    private Scanner scanner;
    private Map<Integer, MenuAction> actions;

    public MenuActionFactory(Scanner scanner) {
        this.scanner = scanner;
        this.actions = new HashMap<>();
        initializeActions();
    }

    private void initializeActions() {
        actions.put(1, new DeadlineAction(scanner));
        actions.put(2, new ProjectAction(scanner));
        actions.put(3, new ToetsAction(scanner));
        actions.put(4, new DaglijstAction(scanner));
        actions.put(5, new RapportageAction(scanner));
    }

    public MenuAction createMenuAction(int keuze) {
        return actions.getOrDefault(keuze, null);
    }
}
