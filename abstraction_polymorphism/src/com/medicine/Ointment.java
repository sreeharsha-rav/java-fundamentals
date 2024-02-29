package com.medicine;
public class Ointment extends Medicine {
    private String medicineName;
    private String manufacturer;

    public Ointment(double price, String expiryDate, String medicineName, String manufacturer) {
        super(price, expiryDate);
        this.medicineName = medicineName;
        this.manufacturer = manufacturer;
    }

    @Override
    public void displayLabel() {
        System.out.println("for external use only");
        System.out.println("............");
    }

    public void getDetails() {
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Manufacturer: " + manufacturer);
        super.getDetails();
    }
}
