package duck;

import duck.entities.IDuck;

import java.util.ArrayList;
import java.util.List;

public class DuckDecoy {

    private List<IDuck> ducks = new ArrayList<>();

    public void addDuck(IDuck duck) {
        this.ducks.add(duck);
    }

    public void removeDuck(IDuck duck) {
        this.ducks.remove(duck);
    }

    public void flyAll() {
        for(IDuck duck : this.ducks) {
            duck.fly();
        }
    }

    public void singAll() {
        for(IDuck duck : this.ducks) {
            duck.sing();
        }
    }
}
