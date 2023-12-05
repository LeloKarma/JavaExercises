package Inheritance;

class Plant {
    private String name;
    private int height;

    public Plant(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void grow() {
        System.out.println(name + " is growing.");
    }
}

class Tree extends Plant {
    private boolean isEvergreen;

    public Tree(String name, int height, boolean isEvergreen) {
        super(name, height);
        this.isEvergreen = isEvergreen;
    }

    public boolean isEvergreen() {
        return isEvergreen;
    }

    public void setEvergreen(boolean isEvergreen) {
        this.isEvergreen = isEvergreen;
    }

    public void shedLeaves() {
        if (!isEvergreen) {
            System.out.println(getName() + " is shedding leaves.");
        }
    }
}

class Flower extends Plant {
    private String color;

    public Flower(String name, int height, String color) {
        super(name, height);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void bloom() {
        System.out.println(getName() + " is blooming with " + color + " flowers.");
    }
}

public class PlantDemo {
    public static void main(String[] args) {
        Tree oakTree = new Tree("Oak", 10, true);
        oakTree.grow();
        oakTree.shedLeaves();

        Flower rose = new Flower("Rose", 2, "Red");
        rose.grow();
        rose.bloom();
    }
}