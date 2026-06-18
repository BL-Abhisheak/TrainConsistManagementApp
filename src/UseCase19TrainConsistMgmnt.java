import java.util.Arrays;

/**
 * =========================================================
 * MAIN CLASS – UseCase19TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 19: Binary Search for Bogie ID
 *
 * Description:
 * This class demonstrates searching for a specific bogie ID
 * using the Binary Search algorithm on sorted data.
 *
 * At this stage, the application:
 * - Creates sorted bogie ID array
 * - Defines search key
 * - Applies binary search logic
 * - Narrows search range each iteration
 * - Displays result
 *
 * This maps optimized searching logic using divide-and-conquer.
 *
 * @author Developer
 * @version 19.0
 */

public class UseCase19TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("===============================================\n");

        // Create sorted array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Ensure data is sorted before binary search (precondition)
        Arrays.sort(bogieIds);

        // Search key
        String key = "BG309";

        // Display available bogies
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // ---- BINARY SEARCH LOGIC ----
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // Continue until search range is exhausted
        while (low <= high) {

            // Find middle index
            int mid = (low + high) / 2;

            // Compare middle element with key
            int result = bogieIds[mid].compareTo(key);

            // If match found
            if (result == 0) {
                found = true;
                break;
            }

            // If key is greater, search right half
            else if (result < 0) {
                low = mid + 1;
            }

            // If key is smaller, search left half
            else {
                high = mid - 1;
            }
        }

        // Display result
        if (found) {
            System.out.println("\nBogie " + key + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + key + " NOT found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}
