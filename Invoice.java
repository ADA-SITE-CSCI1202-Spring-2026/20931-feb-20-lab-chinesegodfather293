public class Invoice {
    String number;
    String description;
    int quantity;
    double price;

    public Invoice(String Number, String Description, int Quantity, double Price){
        number = Number;
        description = Description;
        quantity = Quantity;
        price = Price;
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }

    public String getNumber() { return number; }
    public String getDescription() { return description; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    public void setNumber(String Number){ number = Number; }
    public void setDescription(String Description){ description = Description; }
    public void setQuantity(int Quantity){ quantity = Quantity; }
    public void setPrice(double Price){ price = Price; }
}