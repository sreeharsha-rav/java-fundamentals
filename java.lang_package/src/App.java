public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exploring java.lang package");
        System.out.println("=====================================");
        // Create 3 instances of Employee
        System.out.println("Comparing Employee objects");
        Employee emp1 = new Employee(1, "John");
        Employee emp2 = new Employee(2, "Jane");
        Employee emp3 = new Employee(1, "John");

        // Demonstrate use of toString() method
        System.out.println("emp1: " + emp1);
        System.out.println("emp2: " + emp2);
        System.out.println("emp3: " + emp3);

        // Demonstrate use of hashCode() method
        System.out.println("emp1.hashCode(): " + emp1.hashCode());
        System.out.println("emp2.hashCode(): " + emp2.hashCode());
        System.out.println("emp3.hashCode(): " + emp3.hashCode());

        // Demonstrate use of equals() method
        System.out.println("emp1.equals(emp2): " + emp1.equals(emp2));
        System.out.println("emp1.equals(emp3): " + emp1.equals(emp3));

        // Demonstrate difference between == and equals()
        System.out.println("emp1 == emp3: " + (emp1 == emp3));
        System.out.println("=====================================");

        // Demonstrate difference between String and String Builder
        System.out.println("Difference between String and String Builder");
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println("String comparison:" + " str1 = " + str1 + " str2 = " + str2);
        System.out.println("str1 == str2: " + (str1 == str2));
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println("StringBuilder comparison:" + " sb1 = " + sb1 + " sb2 = " + sb2);
        System.out.println("sb1 == sb2: " + (sb1 == sb2));
        System.out.println("=====================================");

        // Mathematical operations
        System.out.println("Mathematical operations");
        int a = 10;
        int b = 20;
        MathOperations mathOps = new MathOperationsImpl();
        System.out.println("a + b = " + mathOps.add(a, b));
        System.out.println("a - b = " + mathOps.subtract(a, b));
        System.out.println("a * b = " + mathOps.multiply(a, b));
        System.out.println("a / b = " + mathOps.divide(a, b));
        System.out.println("a % b = " + mathOps.modulus(a, b));
        System.out.println("a++ = " + mathOps.increment(a));
        System.out.println("a-- = " + mathOps.decrement(a));
        System.out.println("=====================================");
    }
}
