package commands;

import composition.ComposCollection;
import java.util.Scanner;

public class FindComposition implements Command {
    private ComposCollection collection;
    private Scanner scanner;

    public FindComposition(ComposCollection collection, Scanner scanner) {
        this.collection = collection;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
    }
}
