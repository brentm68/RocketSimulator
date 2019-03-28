import java.util.Random;

public class U1 extends Rocket {

    public void U1() {
        Rocket.cost = 100000000;
        Rocket.weight = 20000;
        Rocket.maxWeight = 36000;
    }

    @Override
    public boolean launch() {
        double val1 = .05 * ((double)weight*(double)maxWeight);
        boolean val2 = new Random().nextInt((int)val1)==0;
        return val2;
    }

    @Override
    public boolean land() {
        double val1 = .01 * ((double)weight*(double)maxWeight);
        boolean val2 = new Random().nextInt((int)val1)==0;
        return val2;
    }
}
