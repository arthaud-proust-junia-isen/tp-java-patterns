import duck.*;

public class Main {
    public static void main(String[] args) {
        Mallard mallard = new Mallard("Jeremy");
        Pochard pochard = new Pochard("Joris");
        PlasticDuck plasticDuck = new PlasticDuck("Jonathan");

        DuckDecoy decoy = new DuckDecoy();
        decoy.addDuck(mallard);
        decoy.addDuck(pochard);
        decoy.addDuck(plasticDuck);

        decoy.flyAll();

        // La fée vient le voir.
        plasticDuck.setBehaviorFly(new BehaviorLikeSupermanFly());
        decoy.flyAll();

        pochard.setBehaviorFly(plasticDuck.getBehaviorFly());
        decoy.flyAll();

        mallard.setBehaviorFly(new BehaviorFly() {
            @Override
            public void fly(final IDuck duck) {
                System.out.println(duck.getName() + ": Je me suis pété une aile !");
            }
        });
        decoy.flyAll();

    }
}