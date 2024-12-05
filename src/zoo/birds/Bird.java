package zoo.birds;

public abstract class Bird {
    protected String name;
    private boolean canSing;

    public Bird(String name) {
        this.name = name;
        this.canSing = false;
    }

    public Bird(String name, boolean canSing) {
        this.name = name;
        this.canSing = canSing;
    }

    public abstract void fly();

    public void layEggs() {
        System.out.println(name + " is laying eggs.");
    }
}
