import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        File file1 = new File("phase-1.txt");
        File file2 = new File("phase-2.txt");

        ArrayList<Item> phaseOneArrayList = new ArrayList<>(Simulation.loadItems(file1));
        ArrayList<Item> phaseTwoArrayList = new ArrayList<>(Simulation.loadItems(file2));

        System.out.println(phaseOneArrayList.toString());
        System.out.println(phaseTwoArrayList.toString());
    }
}
