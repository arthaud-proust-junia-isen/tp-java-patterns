package duck;

public class PlasticDuck extends Duck{

    public PlasticDuck(final String name) {
        super(name, new BehaviorPouetFly());
    }

}
