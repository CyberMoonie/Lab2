public class SyrupCappuccino extends Cappuccino {
    private SyrupType syrup;

    public SyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk, SyrupType syrup) {
        super(coffeeIntensity, mlOfMilk);
        this.syrup = syrup;
    }

    public SyrupType getSyrup() {
        return syrup;
    }

    @Override
public void printCoffeeDetails() {
    System.out.println("Syrup Cappuccino:");
    System.out.println("Coffee intensity: " + getCoffeeIntensity());
    System.out.println("Cappuccino milk: " + getMlOfMilk() + " mg");
    System.out.println("Syrup type: " + syrup + "\n");
}



    }

