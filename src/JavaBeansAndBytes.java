import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        yearFounded = 2024;
        System.out.println("We were founded in " + yearFounded + ".");

        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("water");
        countCups();
        baristasChoice();

        CoffeeDrink coffee1 = new CoffeeDrink(9, "gasoline", false);
        CoffeeDrink coffee2 = new CoffeeDrink(1000, "seawater", false);

        coffee1.setFlavor("gasoline");
        String newSpecial = coffee2.getFlavor();
        specialOfTheDay(newSpecial);
        // TODO
        // Print out the order details
        coffee1.printInfo();
        coffee2.printInfo();

    }

    // Method to generate a random discount
    public void randomDiscount() {
        int discount = (int)(Math.random()*31);
        System.out.println("you have received a "+discount+"% discount");
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String special) {
        System.out.println("today's special is "+special);
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");
        for (int i=1; i<6; i++) {
            System.out.println(i);
        }
        System.out.println();
        for (int i=2; i<12; i=i+3) {
            System.out.print(i +",");
        }
        System.out.println();
        for (int i=8; i>=0; i--) {
            System.out.println(i);
        }



    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
       double choice = Math.random();
       if (choice<0.25) {
           System.out.println("lemonade");
       } else if (choice<0.5) {
           System.out.println("water");
       } else if (choice<0.75) {
           System.out.println("gasoline");
       } else {
           System.out.println("bleach");
       }
    }
}

