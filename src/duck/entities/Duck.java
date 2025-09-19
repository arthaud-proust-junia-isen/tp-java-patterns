package duck.entities;

import duck.behaviors.BehaviorFly;

public abstract class Duck implements IDuck {

    private final String name;

    @Override
    public BehaviorFly getBehaviorFly() {
        return this.behaviorFly;
    }

    @Override
    public void setBehaviorFly(final BehaviorFly behaviorFly) {
        this.behaviorFly = behaviorFly;
    }

    private BehaviorFly behaviorFly;

    public Duck(String name, BehaviorFly behaviorFly) {
        this.name = name;
        this.behaviorFly = behaviorFly;
    }


    @Override
    public void fly() {
        this.behaviorFly.fly(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
