public class Rocket implements SpaceShip {

    int cost;
    int weight;
    int maxWeight;

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
        return (item.weight + this.weight < maxWeight);
    }

    @Override
    public int carry(Item item) {
        return (this.weight += item.weight);
        }

    public int getWeight() {
        return weight;
    }
}