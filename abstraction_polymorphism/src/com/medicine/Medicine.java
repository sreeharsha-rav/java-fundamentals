package com.medicine;
public abstract class Medicine {
    private double price;
    private String expiryDate;

    public Medicine(double price, String expiryDate) {
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public abstract void displayLabel();

    public void getDetails() {
        System.out.println("Price: " + price);
        System.out.println("Expiry Date: " + expiryDate);
    }
}
