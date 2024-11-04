public class Cappuccino extends Coffee {
    private int mlOfMilk;

    public Cappuccino(Intensity coffeeIntensity, int mlOfMilk) {
        super(coffeeIntensity);
        this.mlOfMilk = mlOfMilk;
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }

    public Cappuccino makeCappuccino() {
        System.out.println("Making Cappuccino");
        System.out.println("Intensity set to " + getCoffeeIntensity());
        System.out.println("Adding " + mlOfMilk + " ml of Milk\n");
        return this;
    }

    @Override
    public void printCoffeeDetails() {
        System.out.println("Coffee Name: Cappuccino");
        System.out.println("Coffee Intensity: " + getCoffeeIntensity());
        System.out.println("Milk: " + mlOfMilk + " ml\n");
    }
}
