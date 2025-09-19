package duck.entities;

import duck.behaviors.BehaviorFlyPouet;

public class DuckPlastic extends Duck{

    public DuckPlastic(final String name) {
        super(name, new BehaviorFlyPouet());
    }

}
