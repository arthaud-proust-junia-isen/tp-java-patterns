package duck.entities;

import duck.behaviors.BehaviorFlyPouet;
import duck.behaviors.BehaviorSingPouet;

public class DuckPlastic extends Duck{

    public DuckPlastic(final String name) {
        super(name, new BehaviorFlyPouet(), new BehaviorSingPouet());
    }

}
