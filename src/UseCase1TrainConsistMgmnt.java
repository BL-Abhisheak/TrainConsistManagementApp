import java.util.ArrayList;
import java.util.List;

/**
 * UC1: Initialize Train and Display Consist Summary
 * -----------------------------------------------
 * This class represents the entry point of the Train Consist Management App.
 * It initializes the train with no bogies and displays the initial state.
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

        // Initialize an empty list to hold bogies dynamically
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Display consist summary
        System.out.println("Current Train Consist : " + trainConsist);

        // Program continues (future UCs will extend from here)
        System.out.println("\nSystem ready for operations...");
    }
}
