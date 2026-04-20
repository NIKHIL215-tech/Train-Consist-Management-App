import java.util.Arrays;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== UC19 - Binary Search for Bogie ID (Optimized) ===");

        // Pre-sorted array of bogie IDs (Binary Search requirement)
        String[] bogieIds = {"B101", "B102", "B103", "B104", "B105"};
        String searchKey = "B104";

        System.out.println("\nSorted Bogie IDs: " + Arrays.toString(bogieIds));
        System.out.println("Searching for: " + searchKey);

        // 🔥 BINARY SEARCH
        int low = 0;
        int high = bogieIds.length - 1;
        int position = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                position = mid;
                break; // Found
            } else if (comparison > 0) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }

        // Result output
        if (position != -1) {
            System.out.println("Result: Bogie " + searchKey + " found at index " + position + " (using Binary Search) ✅");
        } else {
            System.out.println("Result: Bogie " + searchKey + " not found ❌");
        }

        System.out.println("\nUC19 binary search completed...");
    }
}
