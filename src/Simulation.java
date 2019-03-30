import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Simulation {

    static ArrayList<Rocket> rockets;
    static LinkedList queue = new LinkedList();


    public static ArrayList loadItems(File file) {

        ArrayList<Item> itemsToLoad = new ArrayList<>();
        Scanner scanner = null;
        String read;

        try { 
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                read = scanner.nextLine();
                String[] splitWord = read.split("=");
                String first = splitWord[0];
                int second = (Integer.parseInt(splitWord[1]));
                Item item = new Item(first, second);
                itemsToLoad.add(item);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No File Found");
        }


        return itemsToLoad;
    }
//    public static void loadU1() {
//

//
//          }
}
