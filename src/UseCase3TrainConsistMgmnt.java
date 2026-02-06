import java.util.HashSet;
import java.util.Set;

/**
 * UC3: Track Unique Bogie IDs (Set – HashSet)
 * ------------------------------------------
 * This use case ensures that no duplicate bogie IDs
 * are added into the train formation.
 */

public class UseCase3TrainConsistMgmnt {

    public static void main() {
        System.out.println("=======================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("=======================================\n");

        // Create a Set to store unique bogie IDs
        Set <String> bogies = new HashSet<>();


        // ---- ADD IDs (including duplicates) ----
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");
        bogies.add("BG101"); //Duplicate entry
        bogies.add("BG102"); //Duplicate entry


        // Display result
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        // Explain behavior
        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }


}
