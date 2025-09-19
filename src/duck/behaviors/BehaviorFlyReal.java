package duck.behaviors;

import duck.entities.IDuck;

public class BehaviorFlyReal implements BehaviorFly{
    @Override
    public void fly(final IDuck duck) {
        System.out.println(duck.getName() + ": Je vole !");
    }
}
