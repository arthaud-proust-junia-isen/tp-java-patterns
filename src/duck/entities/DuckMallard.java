package duck.entities;

import duck.behaviors.BehaviorFlyReal;

public class DuckMallard extends Duck{

    public DuckMallard(final String name) {
        super(name, new BehaviorFlyReal());
    }
}
