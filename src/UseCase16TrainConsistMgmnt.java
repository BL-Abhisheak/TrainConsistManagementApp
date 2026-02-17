/**
 * =========================================================
 * MAIN CLASS – UseCase16TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 16: Sort Passenger Bogies by Capacity
 *
 * Description:
 * This class demonstrates manual sorting of passenger
 * bogie capacities using the Bubble Sort algorithm
 * instead of built-in sorting utilities.
 *
 * At this stage, the application:
 * - Creates an array of capacities
 * - Compares adjacent values
 * - Swaps values when required
 * - Repeats passes until sorted
 * - Displays sorted result
 *
 * This maps algorithmic sorting logic using Bubble Sort.
 *
 * @author Developer
 * @version 16.0
 */

public class UseCase16TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println(" UC16 - Manual Sorting using Bubble Sort ");
        System.out.println("===============================================\n");

        // Create array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // Display original order
        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // ---- BUBBLE SORT LOGIC ----
        // Outer loop controls number of passes
        for (int i = 0; i < capacities.length - 1; i++) {

            // Inner loop compares adjacent elements
            for (int j = 0; j < capacities.length - i - 1; j++) {

                // Swap if left value is greater than right value
                if (capacities[j] > capacities[j + 1]) {

                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display sorted result
        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nUC16 sorting completed...");
    }
}
