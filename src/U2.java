import java.util.Random;

public class U2 extends Rocket {


    public void U2() {

        Rocket.cost = 120000000;
        Rocket.weight = 36000;
        Rocket.maxWeight = 58000;
    }

    @Override
    public boolean launch() {
        double val1 = .04 * ((double)weight*(double)maxWeight);
        boolean val2 = new Random().nextInt((int)val1)==0;
        return val2;
    }

    @Override
    public boolean land() {
        double val1 = .08 * ((double)weight*(double)maxWeight);
        boolean val2 = new Random().nextInt((int)val1)==0;
        return val2;
    }
}
