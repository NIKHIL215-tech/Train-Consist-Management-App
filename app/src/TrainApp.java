import java.util.Arrays;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== UC18 - Linear Search for Bogie ID ===");

        // Array of bogie IDs
        String[] bogieIds = {"B101", "B105", "B103", "B102", "B104"};
        String searchKey = "B103";

        System.out.println("\nBogie IDs: " + Arrays.toString(bogieIds));
        System.out.println("Searching for: " + searchKey);

        // 🔥 LINEAR SEARCH
        boolean found = false;
        int position = -1;

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                position = i;
                break; // Stop immediately once found
            }
        }

        // Result output
        if (found) {
            System.out.println("Result: Bogie " + searchKey + " found at index " + position + " ✅");
        } else {
            System.out.println("Result: Bogie " + searchKey + " not found ❌");
        }

        System.out.println("\nUC18 linear search completed...");
    }
}
