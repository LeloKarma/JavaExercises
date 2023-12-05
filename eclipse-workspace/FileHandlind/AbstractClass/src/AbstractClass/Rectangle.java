package AbstractClass;

public class Rectangle implements Printable {
    private int width;
    private int height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public void print() {
        System.out.println("Rectangle: width=" + width + ", height=" + height);
    }
}