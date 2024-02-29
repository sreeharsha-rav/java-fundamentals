package com.medicine;
public class Tablet extends Medicine {
    private String medicineName;
    private String manufacturer;

    public Tablet(double price, String expiryDate, String medicineName, String manufacturer) {
        super(price, expiryDate);
        this.medicineName = medicineName;
        this.manufacturer = manufacturer;
    }

    @Override
    public void displayLabel() {
        System.out.println("store in a cool dry place");
        System.out.println("............");
    }

    public void getDetails() {
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Manufacturer: " + manufacturer);
        super.getDetails();
    }
}