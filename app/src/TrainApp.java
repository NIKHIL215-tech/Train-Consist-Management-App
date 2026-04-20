import java.util.ArrayList;
import java.util.List;

// 🔥 Custom Runtime Exception for Cargo Safety
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// 🚆 Goods Bogie Class
class GoodsBogie {
    String type;   // Cylindrical, Rectangular
    String cargo;  // Petroleum, Coal, Grain

    GoodsBogie(String type) {
        this.type = type;
        this.cargo = "Empty";
    }

    // 🔥 Assignment method with safety validation
    public void assignCargo(String newCargo) {
        System.out.println("\nAttempting to assign " + newCargo + " to " + type + " bogie...");
        
        try {
            // Safety Rule: Petroleum must ONLY be in Cylindrical bogies
            if (newCargo.equalsIgnoreCase("Petroleum") && !type.equalsIgnoreCase("Cylindrical")) {
                throw new CargoSafetyException("SAFETY ALERT: Petroleum cannot be assigned to " + type + " bogie!");
            }
            
            this.cargo = newCargo;
            System.out.println("Assignment SUCCESS ✅: " + newCargo + " assigned to " + type);
            
        } catch (CargoSafetyException e) {
            System.out.println("Assignment FAILED ❌: " + e.getMessage());
        } finally {
            // finally block always executes
            System.out.println("Validation Process Completed for " + type + " bogie.");
        }
    }

    @Override
    public String toString() {
        return type + " Bogie [Cargo: " + cargo + "]";
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== UC15 - Safe Cargo Assignment Using try-catch-finally ===");

        // Create different types of goods bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // 1️⃣ Safe Assignment
        b1.assignCargo("Petroleum");

        // 2️⃣ Unsafe Assignment (Will trigger exception handling)
        b2.assignCargo("Petroleum");

        // 3️⃣ Another Safe Assignment
        b2.assignCargo("Coal");

        // Display Final Status
        System.out.println("\nFinal Train Status:");
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("\nUC15 structured exception handling completed...");
    }
}
