import java.util.LinkedList;
import java.util.List;


/**
 * UC4: Maintain Ordered Bogie Consist (LinkedList Operations)
 * ----------------------------------------------------------
 * This use case models the physical chaining of train bogies.
 * It demonstrates insertion and removal at different positions
 * using a LinkedList.
 */

public class UseCase4TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("=======================================\n");

        // Create a LinkedList to represent ordered train consist
        List<String> trainConsist = new LinkedList<>();

        // ---- ADD bogies in sequence ----
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // ---- INSERT in the middle ----
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // ---- REMOVE from front and end ----
        trainConsist.remove(0); // remove first
        trainConsist.remove(trainConsist.size() - 1); // remove last

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
    }

}







