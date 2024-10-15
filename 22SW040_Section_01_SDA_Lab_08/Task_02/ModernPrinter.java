class ModernPrinter {
    private PrintableList printableList;

    // Injecting the PrintableList (which will be the adapter)
    public ModernPrinter(PrintableList printableList) {
        this.printableList = printableList;
    }

    public void print(List<String> list) {
        printableList.printList(list);  // Using the adapter to print a list
    }
}
