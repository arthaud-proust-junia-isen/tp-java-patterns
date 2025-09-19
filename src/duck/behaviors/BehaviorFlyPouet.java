package duck.behaviors;

import duck.entities.IDuck;

public class BehaviorFlyPouet implements BehaviorFly{
    @Override
    public void fly(final IDuck duck) {
        System.out.println(duck.getName() + ": Pouet pouet !");
    }
}
