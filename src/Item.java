public class Item {
    String name;
    int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

//    public Item(Object obj) {
//        this.name = obj.
//
//    }

    @Override
    public String toString() {
        return (name + ", " + weight);
    }

}
