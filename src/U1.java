public class U1 extends Rocket {

    public void U1() {
        Rocket.cost = 100000000;
        Rocket.weight = 20000;
        Rocket.maxWeight = 36000;
    }

    @Override
    public boolean launch() {
        return false;
    }

    @Override
    public boolean land() {

        return true;
    }
}
