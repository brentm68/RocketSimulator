import java.util.Random;

public class U2 extends Rocket {

    public U2() {

        cost = 120000000;
        weight = 36000;
        maxWeight = 58000;
    }

    @Override
    public boolean launch() {
        float value1 = .04f*((float)this.weight/(float)this.maxWeight);
        float random = new Random().nextInt(20);
        return (value1*random != 0);
    }

    @Override
    public boolean land() {
        float value1 = .08f*((float)this.weight/(float)this.maxWeight);
        float random = new Random().nextInt(20);
        return (value1*random != 0);
    }
}
