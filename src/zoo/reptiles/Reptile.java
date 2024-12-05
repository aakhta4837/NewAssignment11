package zoo.reptiles;

import zoo.animals.Animal;

public abstract class Reptile extends Animal {
    private boolean isVenomous;

    public Reptile(String name) {
        super(name);
        this.isVenomous = false;
    }

    public Reptile(String name, boolean isVenomous) {
        super(name);
        this.isVenomous = isVenomous;
    }

    public abstract void crawl();
}


