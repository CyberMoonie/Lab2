public class Cappuccino extends Coffee {
    private int mlOfMilk;

    public Cappuccino(Intensity coffeeIntensity, int mlOfMilk) {
        super(coffeeIntensity);
        this.mlOfMilk = mlOfMilk;
    }

    public void makeCappuccino() {
        System.out.println("=====Making Coffee=====");
        System.out.println("Intensity set to " + getCoffeeIntensity());
        System.out.println("Adding " + mlOfMilk + " ml of Milk");
        System.out.println("=======================\n");

    }

    @Override
    public void printCoffeeDetails() {
        System.out.println("=====Your Coffee=====");
        System.out.println("Coffee Name: Cappuccino");
        super.printCoffeeDetails();
        System.out.println("Milk: " + mlOfMilk + " ml");
        System.out.println("=====================");

    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }
}
