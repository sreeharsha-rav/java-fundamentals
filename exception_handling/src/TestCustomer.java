public class TestCustomer {
    public static void main(String[] args) {
        // Test Customer class
        try {
            Customer customer = new Customer("C001", "John", "Gold");
            System.out.println(customer);
        } catch (InvalidInputException e) {
            System.out.println("Caught InvalidInputException: " + e.getMessage());
        }

        try {
            Customer customer = new Customer("001", "John", "Gold");
            System.out.println(customer);
        } catch (InvalidInputException e) {
            System.out.println("Caught InvalidInputException: " + e.getMessage());
        }

        try {
            Customer customer = new Customer("C001", "J", "Gold");
            System.out.println(customer);
        } catch (InvalidInputException e) {
            System.out.println("Caught InvalidInputException: " + e.getMessage());
        }

        try {
            Customer customer = new Customer("C001", "John", "Gold1");
            System.out.println(customer);
        } catch (InvalidInputException e) {
            System.out.println("Caught InvalidInputException: " + e.getMessage());
        }

    }
}
