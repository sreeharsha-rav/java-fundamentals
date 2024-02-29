package com.medicine;
public class Syrup extends Medicine {
    private String medicineName;
    private String manufacturer;

    public Syrup(double price, String expiryDate, String medicineName, String manufacturer) {
        super(price, expiryDate);
        this.medicineName = medicineName;
        this.manufacturer = manufacturer;
    }

    @Override
    public void displayLabel() {
        System.out.println("store in a cool dry place away from sunlight");
        System.out.println("............");
    }

    public void getDetails() {
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Manufacturer: " + manufacturer);
        super.getDetails();
    }
}