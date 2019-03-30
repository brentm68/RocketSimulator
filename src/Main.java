import java.io.File;
import java.util.ArrayList;

public class Main {

    static File file1 = new File("phase-1.txt");
    static File file2 = new File("phase-2.txt");

    public static void main(String args[]) {

        ArrayList<Item> phaseOneArrayList = new ArrayList<>(Simulation.loadItems(file1));
        System.out.println(phaseOneArrayList.toString());
//        ArrayList<Item> phaseTwoArrayList = new ArrayList<>(Simulation.loadItems(file2));

    }
}
