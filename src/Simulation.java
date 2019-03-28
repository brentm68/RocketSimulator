import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public ArrayList<Item> loadItems() {
        Scanner s = new Scanner(new File("phase-1.txt"));
        ArrayList<String> loaded = new ArrayList<String>();
        while (s.hasNext()) {
            loaded.add(s.next());
        }
        s.close();
    }

}
