package duck.entities;

import duck.behaviors.BehaviorFly;
import duck.behaviors.BehaviorSing;

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

    @Override
    public BehaviorSing getBehaviorSing() {
        return this.behaviorSing;
    }

    @Override
    public void setBehaviorSing(final BehaviorSing behaviorSing) {
        this.behaviorSing = behaviorSing;
    }

    private BehaviorFly behaviorFly;
    private BehaviorSing behaviorSing;

    public Duck(String name, BehaviorFly behaviorFly, BehaviorSing behaviorSing) {
        this.name = name;
        this.behaviorFly = behaviorFly;
        this.behaviorSing = behaviorSing;
    }


    @Override
    public void fly() {
        this.behaviorFly.fly(this);
    }

    @Override
    public void sing() {
        this.behaviorSing.sing(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
