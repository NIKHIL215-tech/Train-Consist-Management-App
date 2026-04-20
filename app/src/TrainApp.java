import java.util.Arrays;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== UC16 - Sort Passenger Bogies by Capacity (Bubble Sort) ===");

        // Create an array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 90, 40};

        System.out.println("\nBefore Sorting: " + Arrays.toString(capacities));

        // 🔥 BUBBLE SORT ALGORITHM
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent values
                if (capacities[j] > capacities[j + 1]) {
                    // Swap values if out of order
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display sorted result
        System.out.println("After Sorting (Bubble Sort): " + Arrays.toString(capacities));

        System.out.println("\nUC16 Bubble Sort completed...");
    }
}
