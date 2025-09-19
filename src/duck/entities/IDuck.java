package duck.entities;

import duck.behaviors.BehaviorFly;

public interface IDuck {
    BehaviorFly getBehaviorFly();

    void setBehaviorFly(BehaviorFly behaviorFly);

    void fly();

    String getName();
}
