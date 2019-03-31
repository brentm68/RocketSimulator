import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Simulation {

    static File file1 = new File("phase-1.txt");
    static File file2 = new File("phase-2.txt");
    ArrayList<Rocket> rocketsu1;
    ArrayList<Rocket> rocketsu2;
    static LinkedList queue = new LinkedList();
    static int totalCost;
    String rocket;
    static int totalCostU1;
    static int totalCostU2;

    public static ArrayList loadItems(File file) {

        ArrayList<String> itemsToLoad = new ArrayList<>();
        Scanner scanner = null;
        String read;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                read = scanner.nextLine();
                itemsToLoad.add(read);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No File Found");
        }
        return itemsToLoad;
    }

    public static ArrayList<Rocket> loadU1(File file) {

        ArrayList<String> toLoadU1;
        if(file == file1) {
            toLoadU1 = new ArrayList<>(loadItems(file1));
        } else {toLoadU1 = new ArrayList<>(loadItems(file2));}

        ArrayList<Rocket> rocketsU1 = new ArrayList<>();

        for (int count = 0; count < toLoadU1.size(); count++) {
            queue.addLast(toLoadU1.get(count));
        }
        while (!queue.isEmpty()) {
            Rocket rocket = new U1();
            while (rocket.maxWeight > rocket.getWeight()) {
                if (!queue.isEmpty()) {
                    String itemString = queue.poll().toString();
                    String[] splitWord = itemString.split("=");
                    String first = splitWord[0];
                    int second = (Integer.parseInt(splitWord[1]));
                    Item item = new Item(first, second);
                    if(rocket.canCarry(item)) {
                        rocket.carry(item);
                    } else {
                        rocketsU1.add(rocket);
                      }
                } else break;
            }
        } return rocketsU1;
    }

    public static ArrayList<Rocket> loadU2(File file) {

        ArrayList<String> toLoadU2;
        if(file == file1) {
            toLoadU2 = new ArrayList<>(loadItems(file1));
        } else {toLoadU2 = new ArrayList<>(loadItems(file2));}

        ArrayList<Rocket> rocketsU2 = new ArrayList<>();

        for (int count = 0; count < toLoadU2.size(); count++) {
            queue.addLast(toLoadU2.get(count));
        }
        while (!queue.isEmpty()) {
            Rocket rocket = new U2();
            while (rocket.maxWeight > rocket.getWeight()) {
                if (!queue.isEmpty()) {
                    String itemString = queue.poll().toString();
                    String[] splitWord = itemString.split("=");
                    String first = splitWord[0];
                    int second = (Integer.parseInt(splitWord[1]));
                    Item item = new Item(first, second);
                    if(rocket.canCarry(item)) {
                        rocket.carry(item);
                    } else {
                        rocketsU2.add(rocket);
                    }
                } else break;
            }
        } return rocketsU2;
    }

    public static String runSimulation(String rocket, int phase) {
        File file;
        if(phase == 1) {
            file = file1;
        } else {file = file2;}
                rocket = rocket;
        ArrayList<Rocket> launchingU1 = new ArrayList<>(loadU1(file));
        totalCost = 0;
        totalCostU1 = 0;
        if (rocket == "U1") {
            for (Rocket toLaunch : launchingU1) {
                boolean launched = toLaunch.launch();
                boolean landed = toLaunch.land();
                totalCost += toLaunch.cost;
                if (!launched && landed) {
                    toLaunch.launch();
                    totalCost += toLaunch.cost;
                }
            } totalCostU1 = totalCost;

        } else {
            ArrayList<Rocket> launchingU2 = new ArrayList<>(loadU2(file));
            totalCost = 0;
            totalCostU2=0;
            for (Rocket toLaunch : launchingU2) {
                boolean launched = toLaunch.launch();
                boolean landed = toLaunch.land();
                totalCost += toLaunch.cost;
                if (!launched && !landed) {
                    toLaunch.launch();
                    totalCost += toLaunch.cost;
                }
            } totalCostU2 = totalCost;
        }
        if(rocket == "U1") {
            return "Budget for U1 Rockets for phase " + phase + " is " + totalCostU1 + "\r\n";
        } else return "Budget for U2 Rockets for phase " + phase + " is " + totalCostU2 + "\r\n";
    }
}
