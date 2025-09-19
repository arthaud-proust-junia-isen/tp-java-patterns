import duck.*;
import duck.behaviors.BehaviorFly;
import duck.behaviors.BehaviorFlyLikeSuperman;
import duck.entities.DuckMallard;
import duck.entities.DuckPlastic;
import duck.entities.DuckPochard;
import duck.entities.IDuck;

public class Main {
    public static void main(String[] args) {
        DuckMallard mallard = new DuckMallard("Jeremy");
        DuckPochard pochard = new DuckPochard("Joris");
        DuckPlastic plastic = new DuckPlastic("Jonathan");

        DuckDecoy decoy = new DuckDecoy();
        decoy.addDuck(mallard);
        decoy.addDuck(pochard);
        decoy.addDuck(plastic);

        decoy.flyAll();

        // La fée vient le voir.
        plastic.setBehaviorFly(new BehaviorFlyLikeSuperman());
        decoy.flyAll();

        pochard.setBehaviorFly(plastic.getBehaviorFly());
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