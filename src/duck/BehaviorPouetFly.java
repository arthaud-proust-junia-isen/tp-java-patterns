package duck;

public class BehaviorPouetFly implements BehaviorFly{
    @Override
    public void fly(final IDuck duck) {
        System.out.println(duck.getName() + ": Pouet pouet !");
    }
}
