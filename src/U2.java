public class U2 extends Rocket {


    public void U2() {

        Rocket.cost = 120000000;
        Rocket.weight = 36000;
        Rocket.maxWeight = 58000;
    }

    @Override
    public boolean launch() {

        return true;
    }

    @Override
    public boolean land() {

        return true;
    }
}
