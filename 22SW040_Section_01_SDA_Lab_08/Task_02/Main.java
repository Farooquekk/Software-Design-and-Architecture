public class Main {
    public static void main(String[] args) {
        // Create the old printer (Adaptee)
        OldPrinter oldPrinter = new OldPrinter();

        // Create the adapter to wrap the OldPrinter
        PrintableListAdapter adapter = new PrintableListAdapter(oldPrinter);

        // Use the modern printer (Client) with the adapter
        ModernPrinter modernPrinter = new ModernPrinter(adapter);

        // Print a list of strings using the ModernPrinter, which uses the adapter
        modernPrinter.print(Arrays.asList("Hello", "Adapter", "Pattern"));
    }
}
