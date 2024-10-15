import java.util.*;

class PrintableListAdapter implements PrintableList {
    private OldPrinter oldPrinter;

    public PrintableListAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void printList(List<String> list) {
        // Convert list of strings into a single string
        StringBuilder concatenatedString = new StringBuilder();
        for (String item : list) {
            concatenatedString.append(item).append(" ");  // Space-separated
        }

        // Using OldPrinter to print the single string
        oldPrinter.print(concatenatedString.toString());
    }
}
