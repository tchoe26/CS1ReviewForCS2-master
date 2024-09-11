// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int pNumberOfCups, String pFlavor, boolean pHasWhippedCream) {
        numberOfCups = pNumberOfCups;
        flavor = pFlavor;
        hasWhippedCream = pHasWhippedCream;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        System.out.println("the drink "+flavor+" is "+numberOfCups + " and it is " + hasWhippedCream + " that it has whipped cream.");
    }
}
