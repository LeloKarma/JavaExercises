package Inheritance;

import java.util.Arrays;

abstract class Shape implements Comparable<Shape> {
    public abstract double getArea();
    
    public int compareTo(Shape other) {
        // Compare based on area
        return Double.compare(this.getArea(), other.getArea());
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea() {
        return width * height;
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
    
    public double getArea() {
        return Math.PI * radius * radius;
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
    
    public double getArea() {
        return (Math.sqrt(3) / 4) * sideLength * sideLength;
    }
    
    public String toString() {
        return super.toString() + " EquilateralTriangle";
    }
}

public class ShapeSorting {
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
            System.out.println(shape.toString() + " area: " + shape.getArea());
        }
    }
}