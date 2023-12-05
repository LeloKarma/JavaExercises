package Inheritance;


class Monitor {
    private String brand;
    private String model;
    private int sizeInches;

    public Monitor(String brand, String model, int sizeInches) {
        this.brand = brand;
        this.model = model;
        this.sizeInches = sizeInches;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSizeInches() {
        return sizeInches;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSizeInches(int sizeInches) {
        this.sizeInches = sizeInches;
    }

    public void display() {
        System.out.println(brand + " " + model + " is displaying.");
    }
}

class TV extends Monitor {
    private boolean isSmartTV;

    public TV(String brand, String model, int sizeInches, boolean isSmartTV) {
        super(brand, model, sizeInches);
        this.isSmartTV = isSmartTV;
    }

    public boolean isSmartTV() {
        return isSmartTV;
    }

    public void setSmartTV(boolean isSmartTV) {
        this.isSmartTV = isSmartTV;
    }

    public void playChannel(int channelNumber) {
        System.out.println(getBrand() + " " + getModel() + " is playing channel " + channelNumber);
    }
}

public class TvDemo {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Dell", "U2719D", 27);
        monitor.display();

        TV samsungTV = new TV("Samsung", "QLED Q80A", 55, true);
        samsungTV.display();
        samsungTV.playChannel(123);
    }
}
