package duck.entities;

import duck.behaviors.BehaviorFlyReal;
import duck.behaviors.BehaviorSingReal;

public class DuckPochard extends Duck{

    public DuckPochard(final String name) {
        super(name, new BehaviorFlyReal(), new BehaviorSingReal());
    }

}
