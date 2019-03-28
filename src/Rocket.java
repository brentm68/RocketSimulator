public class Rocket implements SpaceShip {

    static double cost;
    static int weight;
    static int maxWeight;

    @Override
    public boolean launch() {

        return true;
    }

    @Override
    public boolean land() {

        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        if(item.weight + Rocket.weight > Rocket.maxWeight);
        return false;
    }

    @Override
    public int carry(Item item) {
        weight += item.weight;
        return weight;
    }
}