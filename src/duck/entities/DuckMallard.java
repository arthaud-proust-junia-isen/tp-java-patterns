package duck.entities;

import duck.behaviors.BehaviorFlyReal;
import duck.behaviors.BehaviorSingReal;

public class DuckMallard extends Duck{

    public DuckMallard(final String name) {
        super(name, new BehaviorFlyReal(), new BehaviorSingReal());
    }
}
