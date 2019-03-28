import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public static ArrayList loadItems(File file) {

        ArrayList<Item> itemsToLoad = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            String read;

            while (scanner.hasNext()) {
                read = scanner.nextLine();
                String[] split = read.split("=");
                String first = split[0];
                int second = (Integer.parseInt(split[1]));
                Item item = new Item(first, second);
                itemsToLoad.add(item);
                }
            }
            catch(FileNotFoundException e) {
                System.out.println("No File Found");
        }
        return itemsToLoad;
    }
}