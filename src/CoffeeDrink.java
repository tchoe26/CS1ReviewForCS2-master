// CoffeeDrink object class

class CoffeeDrink {

    private  int numberOfCups;
    private  String flavor;
    private boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int NumberOfCups, String Flavor, boolean HasWhippedCream) {
        this.numberOfCups = NumberOfCups;
        this.flavor = Flavor;
        this.hasWhippedCream = HasWhippedCream;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        System.out.println("the drink "+flavor+" is "+numberOfCups + " and it is " + hasWhippedCream + " that it has whipped cream.");
    }
    public void setFlavor(String newFlavor) {
        flavor = newFlavor;
    }
    public String getFlavor() {
        return flavor;
    }
}
