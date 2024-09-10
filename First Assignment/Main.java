class Vegetable {
    static int totalVegetables = 0;  // this is the Static variable
    String name;  

    // this is the Constructor
    Vegetable(String name) {
        this.name = name;
        totalVegetables++;  
    }

    // Instance method
    void displayDetails() {
        System.out.println("Vegetable: " + name);  
    }

    // Static method
    static int getTotalVegetables() {
        return totalVegetables; 
    }
}

public class Main {
    public static void main(String[] args) {
        Vegetable veg1 = new Vegetable("Tomato");  // Instances
        Vegetable veg2 = new Vegetable("Lettuce"); 

        veg1.displayDetails();  
        veg2.displayDetails();  

        System.out.println("Total Vegetables: " + Vegetable.getTotalVegetables());  
    }
}