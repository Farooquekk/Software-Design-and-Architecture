// Adapter class -->  (this will bridge the gap between ArrayList<String> and PrintString)
class PrintableListAdapter implements PrintableList {
    private PrintString printString;
    public PrintableListAdapter(PrintString printString) {
        this.printString = printString;
    }

    @Override
    public void printList(ArrayList<String> list) {

        StringBuilder stringBuilder = new StringBuilder();
        for (String s : list) {
            stringBuilder.append(s).append("\t");
        }


        printString.print(stringBuilder.toString());
    }
}
