package org.example.CG_Questiopns.Assignment.assigment2;
import java.time.LocalDate;

public class Product {
    private int productId;
    private String productName;
    private double price;
    private LocalDate expiryDate;
    private String description;

    public Product(int productId, String productName, double price, LocalDate expiryDate, String description) {
        validateProductName(productName);
        validatePrice(price);
        validateExpiryDate(expiryDate);
        validateDescription(description);

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.expiryDate = expiryDate;
        this.description = description;
    }

    // Validation methods
    private void validateProductName(String name) {
        if (!Character.isUpperCase(name.charAt(0)))
            throw new IllegalArgumentException("Product name must start with a capital letter!");
        if (name.length() > 20)
            throw new IllegalArgumentException("Product name must not exceed 20 characters!");
        if (name.matches("\\d+"))
            throw new IllegalArgumentException("Product name cannot be a number!");
    }

    private void validatePrice(double price) {
        if (price <= 0)
            throw new IllegalArgumentException("Price must be a positive number!");
    }

    private void validateExpiryDate(LocalDate expiry) {
        if (expiry.isBefore(LocalDate.now()))
            throw new IllegalArgumentException("Expiry date must be a future date!");
    }

    private void validateDescription(String desc) {
        if (!desc.contains(",") || !desc.contains("-"))
            throw new IllegalArgumentException("Description must contain ',' and '-'!");
    }

    // Getters
    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public double getPrice() { return price; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public String getDescription() { return description; }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Price: %.2f, Expiry: %s, Desc: %s",
                productId, productName, price, expiryDate, description);
    }
}
