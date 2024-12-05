package zoo.reptiles;

public class Snake extends Reptile {
    private final boolean isVenomous;
    private double length;
    protected String habitat; // New protected member

    public Snake(String name) {
        super(name);
        this.isVenomous = false;
        this.length = 1.5;
        this.habitat = "Grassland";

        // Debugging: Confirm name is set correctly
        System.out.println("Snake constructor called with name: " + this.name);
    }

    public Snake(String name, boolean isVenomous) {
        super(name);
        this.isVenomous = isVenomous;
        this.length = 1.5;
        this.habitat = "Grassland";

        // Debugging: Confirm name is set correctly
        System.out.println("Snake constructor called with name: " + this.name);
    }

    @Override
    public void crawl() {
        // Debugging: Confirm name is accessible
        if (name == null) {
            System.out.println("Warning: name is null in crawl() method");
        }
        System.out.println(name + " is slithering for " + length + " meters in the " + habitat + ".");
    }

    @Override
    public void makeSound() {
        // Debugging: Confirm name is accessible
        if (name == null) {
            System.out.println("Warning: name is null in makeSound() method");
        }
        System.out.println(name + " is hissing.");
    }
}
