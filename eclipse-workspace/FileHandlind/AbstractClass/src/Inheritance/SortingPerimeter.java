package Inheritance;

import java.util.Arrays;

//9

abstract class Shape implements Comparable<Shape> {
    public abstract double getPerimeter();
    
    public int compareTo(Shape other) {
        // Compare based on perimeter
        return Double.compare(this.getPerimeter(), other.getPerimeter());
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getPerimeter() {
        return 2 * (width + height);
    }
    
    public String toString() {
        return super.toString() + " Rectangle";
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public String toString() {
        return super.toString() + " Circle";
    }
}

class EquilateralTriangle extends Shape {
    private double sideLength;
    
    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }
    
    public double getPerimeter() {
        return 3 * sideLength;
    }
    
    public String toString() {
        return super.toString() + " EquilateralTriangle";
    }
}

public class SortingPerimeter {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(5, 10),
            new Circle(3),
            new EquilateralTriangle(4),
            // Add more shapes here...
        };
        
        Arrays.sort(shapes);
        
        // Print sorted shapes
        for (Shape shape : shapes) {
            System.out.println(shape.toString() + " perimeter: " + shape.getPerimeter());
        }
    }
}
