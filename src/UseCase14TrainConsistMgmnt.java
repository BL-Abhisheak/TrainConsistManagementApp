/**
 * =========================================================
 * MAIN CLASS – UseCase14TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
 *
 * Description:
 * This class prevents creation of passenger bogies
 * with invalid seating capacity using a custom exception.
 *
 * At this stage, the application:
 * - Defines a custom exception
 * - Validates capacity inside constructor
 * - Throws exception if capacity ≤ 0
 * - Prevents invalid bogie creation
 * - Continues execution safely
 *
 * This maps fail-fast validation using checked exceptions.
 *
 * @author Developer
 * @version 14.0
 */

public class UseCase14TrainConsistMgmnt {

    // ---- CUSTOM EXCEPTION ----
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Passenger Bogie model with validation
    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) throws InvalidCapacityException {

            // Validate capacity rule
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("===============================================\n");

        try {

            // Valid bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created Bogie: " + b1.type + " -> " + b1.capacity);

            // Invalid bogie (will throw exception)
            PassengerBogie b2 = new PassengerBogie("AC", -10);
            System.out.println("Created Bogie: " + b2.type + " -> " + b2.capacity);

        } catch (InvalidCapacityException e) {

            // Handle exception safely
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}
