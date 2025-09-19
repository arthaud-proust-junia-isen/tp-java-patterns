package duck;

public class BehaviorLikeSupermanFly implements BehaviorFly{
    @Override
    public void fly(final IDuck duck) {
        System.out.println(duck.getName() + ": Je vole comme Superman !");
    }
}
