import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS – UseCase1TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 *
 * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic List to store bogies
 * - Displays initial bogie count
 * - Prints the current state of the train
 *
 * This use case introduces collection initialization and
 * basic program startup flow.
 *
 * @author Developer
 * @version 1.0
 */
public class UseCase1TrainConsistMgmnt {
    /**
     * main() is the entry point of any Java application.
     * The JVM starts execution from here.
     */
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("=======================================");
        System.out.println("   === Train Consist Management App === ");
        System.out.println("=======================================\n");

        // Create a dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully...");

        // size() returns how many bogies are currently attached
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Display consist summary
        System.out.println("Current Train Consist : " + trainConsist);

        // Program continues (future UCs will extend from here)
        System.out.println("\nSystem ready for operations...");
    }
}
