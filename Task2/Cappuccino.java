public class Cappuccino extends Coffee {
    private int mlOfMilk;

    public Cappuccino(Intensity coffeeIntensity, int mlOfMilk) {
        super(coffeeIntensity);
        this.mlOfMilk = mlOfMilk;
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }

    @Override
    public void printCoffeeDetails() {
        System.out.println("Cappuccino:");
        super.printCoffeeDetails();
        System.out.println("Cappuccino milk: " + mlOfMilk + " mg\n");
    }
    

}
