public class Americano extends Coffee {
    private int mlOfWater;

    public Americano(Intensity coffeeIntensity, int mlOfWater) {
        super(coffeeIntensity);
        this.mlOfWater = mlOfWater;
    }

    public int getMlOfWater() {
        return mlOfWater;
    }

    @Override
    public void printCoffeeDetails() {
        System.out.println("Americano:");
        super.printCoffeeDetails();
        System.out.println("Water: " + mlOfWater + " ml\n");
    }
    
    
}
