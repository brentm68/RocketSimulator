public interface SpaceShip {

    //successful luanch or ship crashed
    boolean launch();
    //successful landing or ship crashed
    boolean land();
    //determine if ship can carry <Item>
    boolean canCarry(Item item);
    //add <Item> to ship cargo and update weight
    void carry(Item item);

}