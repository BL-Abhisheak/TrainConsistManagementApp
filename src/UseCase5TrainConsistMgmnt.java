import java.util.LinkedHashSet;
import java.util.Set;


/**
 * UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
 * ------------------------------------------------------
 * This use case maintains the exact attachment order of bogies
 * while ensuring no duplicate bogies are added into the train formation.
 */

public class UseCase5TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("=========================================\n");

        // Create LinkedHashSet to maintain order + uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ---- Attach bogies ----
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // ---- Try to attach duplicate ----
        formation.add("Sleeper"); // duplicate intentionally

        // ---- Display final formation ----
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}

