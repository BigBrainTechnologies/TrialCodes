package basicPrograms;
class OrderValidation {
    public static void validateOrder() {
        // Simulate order validation
        boolean isValid = false; // Simulate validation failure

        if (!isValid) {
            throw new RuntimeException("Order validation failed.");
        }
    }
}

class PaymentProcessor {
    public static void processPayment() {
        // Simulate payment processing
        boolean isSuccess = false; // Simulate payment failure

        if (!isSuccess) {
            throw new RuntimeException("Payment processing failed.");
        }
    }
}

class InventoryManager {
    public static void updateInventory() {
        // Simulate inventory update
        boolean isUpdated = false; // Simulate inventory update failure

        if (!isUpdated) {
            throw new RuntimeException("Inventory update failed.");
        }
    }
}

class ShippingService {
    public static void shipOrder() {
        // Simulate shipping
        boolean isShipped = false; // Simulate shipping failure

        if (!isShipped) {
            throw new RuntimeException("Shipping failed.");
        }
    }
}

public class MobileOrderManagementAppWithoutExceptionHandling {
    public static void main(String[] args) {
        OrderValidation.validateOrder();
        PaymentProcessor.processPayment();
        InventoryManager.updateInventory();
        ShippingService.shipOrder();

        System.out.println("Order processing completed successfully.");
    }
}

