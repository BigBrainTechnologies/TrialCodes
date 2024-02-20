package basicPrograms;

class OrderValidation {
    public static void validateOrder() throws Exception {
        // Simulate order validation
        boolean isValid = true; // Simulate validation result

        if (!isValid) {
            throw new Exception("Order validation failed.");
        }
    }
}

class PaymentProcessor {
    public static void processPayment() throws Exception {
        // Simulate payment processing
        boolean isSuccess = false; // Simulate payment failure

        if (!isSuccess) {
            throw new Exception("Payment processing failed.");
        }
    }
}

class InventoryManager {
    public static void updateInventory() throws Exception {
        // Simulate inventory update
        boolean isUpdated = true; // Simulate inventory update failure

        if (!isUpdated) {
            throw new Exception("Inventory update failed.");
        }
    }
}

class ShippingService {
    public static void shipOrder() throws Exception {
        // Simulate shipping
        boolean isShipped = false; // Simulate shipping failure

        if (!isShipped) {
            throw new Exception("Shipping failed.");
        }
    }
}

public class MobileOrderManagementApp {
    public static void main(String[] args) {
        try {
            OrderValidation.validateOrder();
            PaymentProcessor.processPayment();
            InventoryManager.updateInventory();
            ShippingService.shipOrder();

            System.out.println("Order processing completed successfully.");
        } catch (Exception e) {
            System.out.println("Order processing failed: " + e.getMessage());
        }
    }
}
