public class TestException {
    public static void main(String[] args) throws Exception {
        // Initialize 10 integers in an array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Handle ArrayIndexOutOfBoundsException
        try {
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println("numbers[" + i + "] = " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("=========================================");

        // Handle Exception from throwException method
        System.out.println("Throwing Exception from throwException method in custom ThrowException class");
        ThrowException throwException = new ThrowException();
        try {
            throwException.throwException();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
