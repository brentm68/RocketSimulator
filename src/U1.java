import java.util.Random;

//Chance of launch explosion = 5% * (cargo carried / cargo limit)

public class U1 extends Rocket {

    public  U1() {

        cost = 100000000;
        weight = 20000;
        maxWeight = 36000;
    }

    @Override
    public boolean launch() {
        float value1 = .05f*((float)weight/(float)maxWeight);
        float random = new Random().nextInt(20);
//        float s = random*value1;
//        System.out.println("value1: " + value1 + " random: " + random);
//        System.out.println("s: " + s);
        return (value1*random == 0);
    }

    @Override
    public boolean land() {
        float value1 = .01f*((float)weight/(float)maxWeight);
        float random = new Random().nextInt(20);
//        float s = random*value1;
//        System.out.println("value1: " + value1 + " random: " + random);
//        System.out.println("s: " + s);
        return (value1*random == 0);

    }
}
