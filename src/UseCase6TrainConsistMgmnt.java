import java.util.HashMap;
import java.util.Map;

/**
 * UC6: Map Bogie to Capacity (HashMap)
 * -----------------------------------
 * This use case associates each bogie with its seating or load capacity
 * using a key–value mapping structure.
 */
public class UseCase6TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("========================================\n");

        // Create a HashMap to store bogie-capacity mapping
        Map<String, Integer> capacityMap = new HashMap<>();

        // ---- Insert bogie capacities ----
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);

        // ---- Display all mappings ----
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}
