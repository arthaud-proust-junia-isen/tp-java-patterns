package duck;

public class Mallard extends Duck{

    public Mallard(final String name) {
        super(name, new BehaviorRealFly());
    }
}
