

import java.util.ArrayList;

public class AdapterDesignPatternMain {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        PrintableList p1 = new PrintableListAdapter();
        p1.printList(list);
    }
}
