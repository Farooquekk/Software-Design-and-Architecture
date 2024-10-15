// Client code
public class AdapterPatternExample {
    public static void main(String[] args) {

        PrintString printString = new PrintString();


        PrintableList printableListAdapter = new PrintableListAdapter(printString);


        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");


        printableListAdapter.printList(list);
    }
}

