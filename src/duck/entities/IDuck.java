package duck.entities;

import duck.behaviors.BehaviorFly;
import duck.behaviors.BehaviorSing;

public interface IDuck {
    BehaviorFly getBehaviorFly();
    BehaviorSing getBehaviorSing();

    void setBehaviorFly(BehaviorFly behaviorFly);
    void setBehaviorSing(BehaviorSing behaviorSing);

    void fly();
    void sing();

    String getName();
}
