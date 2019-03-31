import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        String budget = Simulation.runSimulation("U1",1) + Simulation.runSimulation("U1",2);
        System.out.println(budget);
        budget = Simulation.runSimulation("U2",1) + Simulation.runSimulation("U2",2);
        System.out.println(budget);
    }
}
