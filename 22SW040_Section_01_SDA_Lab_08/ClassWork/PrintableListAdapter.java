

import java.util.ArrayList;

public class PrintableListAdapter implements PrintableList {
    public void printList(ArrayList<String> list) {
        // Converting ArrayList<String> to a single String so it can be passed to the Adaptee
        String listString = "";
        for (String s : list) {
            listString += s + "\t"; // Joining strings with a tab separator
        }

        // Instantiating Adaptee class
        PrintString ps = new PrintString();
        ps.print(listString); // Passing the concatenated string to the Adaptee
    }
}
