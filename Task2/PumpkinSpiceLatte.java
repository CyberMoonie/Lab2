public class PumpkinSpiceLatte extends Cappuccino {
    private int mgOfPumpkinSpice;
    private final String name = "PumpkinSpiceLatte";

    public PumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(coffeeIntensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    public int getMgOfPumpkinSpice() {
        return mgOfPumpkinSpice;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
public void printCoffeeDetails() {
    System.out.println("Pumpkin Spice Latte:");
    System.out.println("Coffee intensity: " + getCoffeeIntensity());
    System.out.println("Cappuccino milk: " + getMlOfMilk() + " mg");
    System.out.println("Pumpkin Spice: " + mgOfPumpkinSpice + " mg\n");
}


}
