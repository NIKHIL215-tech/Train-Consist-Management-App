import java.util.Arrays;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== UC17 - Sort Bogie Names Using Arrays.sort() ===");

        // Create an array of bogie type names
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "General", "Pantry"};

        System.out.println("\nBefore Sorting: " + Arrays.toString(bogieTypes));

        // 🔥 Built-in Sorting using Arrays.sort()
        Arrays.sort(bogieTypes);

        // Display sorted result
        System.out.println("After Alphabetical Sorting: " + Arrays.toString(bogieTypes));

        System.out.println("\nUC17 library sorting completed...");
    }
}
