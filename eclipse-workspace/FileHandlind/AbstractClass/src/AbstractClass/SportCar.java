package AbstractClass;

public class SportCar implements Printable {
    private String brand;
    private int serialNumber;
    
    public SportCar(String brand, int serialNumber) {
        this.brand = brand;
        this.serialNumber = serialNumber;
    }
    
    public void print() {
        System.out.println("SportCar: brand=" + brand + ", serialNumber=" + serialNumber);
    }
}