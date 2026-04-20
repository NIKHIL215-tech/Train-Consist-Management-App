import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    // Helper method to simulate searching
    public static void searchBogie(List<String> bogies, String searchKey) {
        System.out.println("\nChecking train consist for searching...");

        // 🔥 DEFENSIVE CHECK: Validation step
        if (bogies.isEmpty()) {
            throw new IllegalStateException("ERROR: Cannot perform search! The train consist is empty (No bogies attached).");
        }

        System.out.println("Bogie list is valid. Proceeding with search for: " + searchKey);
        
        if (bogies.contains(searchKey)) {
            System.out.println("Result: Bogie " + searchKey + " found ✅");
        } else {
            System.out.println("Result: Bogie " + searchKey + " not found ❌");
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC20 - Exception Handling During Search Operations ===");

        // 1️⃣ Case: Searching with empty list (Will fail fast)
        List<String> emptyTrain = new ArrayList<>();
        
        try {
            searchBogie(emptyTrain, "B101");
        } catch (IllegalStateException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        // 2️⃣ Case: Searching with valid list
        List<String> validTrain = new ArrayList<>();
        validTrain.add("B101");
        validTrain.add("B102");

        try {
            searchBogie(validTrain, "B101");
        } catch (IllegalStateException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("\nUC20 defensive programming completed...");
    }
}
