package duck;

public class Pochard extends Duck{

    public Pochard(final String name) {
        super(name, new BehaviorRealFly());
    }

}
