package duck.behaviors;

import duck.entities.IDuck;

public class BehaviorSingReal implements BehaviorSing{
    @Override
    public void sing(final IDuck duck) {
        System.out.println(duck.getName() + ": Coinnn Coinn!");
    }
}
