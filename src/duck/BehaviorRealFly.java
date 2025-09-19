package duck;

public class BehaviorRealFly implements BehaviorFly{
    @Override
    public void fly(final IDuck duck) {
        System.out.println(duck.getName() + ": Je vole !");
    }
}
