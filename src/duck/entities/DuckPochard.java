package duck.entities;

import duck.behaviors.BehaviorFlyReal;

public class DuckPochard extends Duck{

    public DuckPochard(final String name) {
        super(name, new BehaviorFlyReal());
    }

}
