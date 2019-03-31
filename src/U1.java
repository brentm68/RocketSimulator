import java.util.Random;

public class U1 extends Rocket {

    public U1() {

        cost = 100000000;
        weight = 20000;
        maxWeight = 36000;
    }

    @Override
    public boolean launch() {
        float value1 = .05f*((float)this.weight/(float)this.maxWeight);
        float random = new Random().nextInt(20);
        return (value1*random != 0);
    }

    @Override
    public boolean land() {
        float value1 = .01f*((float)this.weight/(float)this.maxWeight);
        float random = new Random().nextInt(20);
        return (value1*random != 0);
    }
}
