package Inheritance;

import java.awt.Color;
import java.util.Arrays;

abstract class Appliance implements Comparable<Appliance> {
    private double voltage;
    private Color color;
    private String madeIn;
    private double price;

    public Appliance(double voltage, Color color, String madeIn, double price) {
        this.voltage = voltage;
        this.color = color;
        this.madeIn = madeIn;
        this.price = price;
    }

    public double getVoltage() {
        return voltage;
    }

    public Color getColor() {
        return color;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int compareTo(Appliance other) {
        // Compare based on price
        return Double.compare(this.price, other.price);
    }

    public String toString() {
        return "Voltage: " + voltage + "V, Color: " + color + ", Made in: " + madeIn + ", Price: $" + price;
    }
}

class Toaster extends Appliance {
    private int slices;
    private boolean hasTimer;
    private boolean isCompact;

    public Toaster(double voltage, Color color, String madeIn, double price, int slices, boolean hasTimer,
            boolean isCompact) {
        super(voltage, color, madeIn, price);
        this.slices = slices;
        this.hasTimer = hasTimer;
        this.isCompact = isCompact;
    }

    public void toast() {
        System.out.println("Toaster is toasting bread...");
    }

    public void setSlices(int slices) {
        this.slices = slices;
    }

    public void setHasTimer(boolean hasTimer) {
        this.hasTimer = hasTimer;
    }

    public void setIsCompact(boolean isCompact) {
        this.isCompact = isCompact;
    }
}

class TV extends Appliance {
    private int screenSize;
    private String resolution;
    private boolean isSmartTV;

    public TV(double voltage, Color color, String madeIn, double price, int screenSize, String resolution,
            boolean isSmartTV) {
        super(voltage, color, madeIn, price);
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.isSmartTV = isSmartTV;
    }

    public void turnOn() {
        System.out.println("TV is turned on.");
    }

    public void turnOff() {
        System.out.println("TV is turned off.");
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setSmartTV(boolean isSmartTV) {
        this.isSmartTV = isSmartTV;
    }
}

class Telephone extends Appliance {
    private String brand;
    private String model;
    private boolean isCordless;

    public Telephone(double voltage, Color color, String madeIn, double price, String brand, String model,
            boolean isCordless) {
        super(voltage, color, madeIn, price);
        this.brand = brand;
        this.model = model;
        this.isCordless = isCordless;
    }

    public void makeCall(String number) {
        System.out.println("Telephone is making a call to " + number);
    }

    public void receiveCall() {
        System.out.println("Telephone is receiving a call.");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCordless(boolean isCordless) {
        this.isCordless = isCordless;
    }
}

public class SortingAppliances{
    public static void main(String[] args) {
        Appliance[] appliances = new Appliance[40];

        // Creating 40 different objects of Toaster, TV, and Telephone
        for (int i = 0; i < 15; i++) {
            appliances[i] = new Toaster(120, Color.WHITE, "USA", 39.99, 2, true, false);
        }

        for (int i = 15; i < 30; i++) {
            appliances[i] = new TV(220, Color.BLACK, "China", 699.99, 55, "4K", true);
        }

        for (int i = 30; i < 40; i++) {
            appliances[i] = new Telephone(110, Color.GRAY, "Japan", 149.99, "Panasonic", "KX-TG785SK", true);
        }

        // Sorting appliances based on price
        Arrays.sort(appliances);

        // Print sortedarray of appliances
        for (Appliance appliance : appliances) {
            System.out.println(appliance);
        }
    }
}