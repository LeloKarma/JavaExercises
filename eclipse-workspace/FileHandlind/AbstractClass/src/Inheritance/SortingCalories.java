package Inheritance;

import java.util.Arrays;

abstract class Food implements Comparable<Food> {
    private int calories;
    
    public Food(int calories) {
        this.calories = calories;
    }
    
    public int getCalories() {
        return calories;
    }
    
    public int compareTo(Food other) {
        // Compare based on calories
        return Integer.compare(this.calories, other.calories);
    }
    
    public abstract String toString();
}

class Falafel extends Food {
    public Falafel(int calories) {
        super(calories);
    }
    
    public String toString() {
        return super.toString() + " Falafel";
    }
}

class Pizza extends Food {
    public Pizza(int calories) {
        super(calories);
    }
    
    public String toString() {
        return super.toString() + " Pizza";
    }
}

class Hamburger extends Food {
    public Hamburger(int calories) {
        super(calories);
    }
    
    public String toString() {
        return super.toString() + " Hamburger";
    }
}

public class SortingCalories{
    public static void main(String[] args) {
        Food[] foods = {
            new Falafel(500),
            new Pizza(800),
            new Hamburger(1000),
           
        };
        
        Arrays.sort(foods);
        
        // Print sorted foods
        for (Food food : foods) {
            System.out.println(food.toString() + " calories: " + food.getCalories());
        }
    }
}