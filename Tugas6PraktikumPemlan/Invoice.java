package Tugas6PraktikumPemlan;

public class Invoice implements Payable {
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    public String getDetails() {
        return String.format("%s: %d x %d = %d", productName, quantity, pricePerItem, (quantity * pricePerItem));
    }
}
