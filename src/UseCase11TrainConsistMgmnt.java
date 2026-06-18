import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * =========================================================
 * MAIN CLASS – UseCase11TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 11: Validate Train ID and Cargo Code
 *
 * Description:
 * This class validates input formats using Regular Expressions.
 *
 * At this stage, the application:
 * - Accepts Train ID input
 * - Accepts Cargo Code input
 * - Applies regex validation
 * - Displays validation result
 *
 * This maps format validation logic using Pattern matching.
 *
 * @author Developer
 * @version 11.0
 */

public class UseCase11TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println(" UC11 - Validate Train ID and Cargo Code ");
        System.out.println("===============================================\n");

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // ---- DEFINE REGEX RULES ----
        // Train ID: TRN- followed by exactly 4 digits
        String trainRegex = "TRN-\\d{4}";

        // Cargo Code: PET- followed by exactly 2 uppercase letters
        String cargoRegex = "PET-[A-Z]{2}";

        // ---- VALIDATION USING Pattern.matches() ----
        boolean isTrainValid = Pattern.matches(trainRegex, trainId);
        boolean isCargoValid = Pattern.matches(cargoRegex, cargoCode);

        // Display results
        System.out.println("\nValidation Results:");

        System.out.println("Train ID Valid: " + isTrainValid);
        System.out.println("Cargo Code Valid: " + isCargoValid);

        System.out.println("\nUC11 validation completed...");

        scanner.close();
    }
}
