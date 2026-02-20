import java.util.Scanner;

public class InvoiceArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nInvoice #" + (i + 1));

            System.out.print("Number: ");
            String number = sc.nextLine();

            System.out.print("Description: ");
            String desc = sc.nextLine();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Price per item: ");
            double price = sc.nextDouble();
            sc.nextLine(); // clear buffer

            invoices[i] = new Invoice(number, desc, qty, price);
        }

        // Print results
        System.out.println("\n===== INVOICE SUMMARY =====");

        for (Invoice inv : invoices) {
            System.out.println("Number: " + inv.getNumber());
            System.out.println("Item: " + inv.getDescription());
            System.out.println("Quantity: " + inv.getQuantity());
            System.out.println("Price: " + inv.getPrice());
            System.out.println("Amount: " + inv.getInvoiceAmount());
            System.out.println("----------------------");
        }

        sc.close();
    }
}