import java.util.LinkedHashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate

        // Display final formation
        System.out.println("Final Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        System.out.println("\nNote:");
        System.out.println("Duplicate bogies are automatically ignored.");

        System.out.println("UC5 LinkedHashSet operations completed successfully...");
    }
}