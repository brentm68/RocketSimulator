public class Item {

    String name;
    int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ("Item Name: "+ this.name + ", " +"Item weight: " + this.weight + " ");
    }

}
