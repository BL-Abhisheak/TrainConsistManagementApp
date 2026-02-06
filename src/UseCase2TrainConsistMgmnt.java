import java.util.ArrayList;
import java.util.List;

/**
 * UC2: Add Passenger Bogies to Train (ArrayList Operations)
 * ---------------------------------------------------------
 * This use case demonstrates how passenger bogies can be added,
 * removed, and inspected dynamically using ArrayList operations.
 */
public class UseCase2TrainConsistMgmnt {
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("=======================================\n");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ---- CREATE (Add bogies) ----
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // ---- DELETE (Remove a bogie) ----
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // ---- READ (Check existence) ----
        boolean hasSleeper = passengerBogies.contains("Sleeper");

        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + hasSleeper);

        // Display final state
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}
