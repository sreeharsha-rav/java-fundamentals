import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class WriteEmployee {
    public static void main(String[] args) {
        // Ask user to enter employee details
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee number: ");
        int empNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter employee name: ");
        String empName = scanner.nextLine();
        System.out.println("Enter employee salary: ");
        double empSalary = scanner.nextDouble();
        scanner.close();

        // Create an Employee object and write it to a file
        Employee emp = new Employee(empNo, empName, empSalary);

        // Write the employee object to a file
        try {
            FileOutputStream fos = new FileOutputStream("io-streams\\files\\emp.ser");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(emp);
            out.close();
            System.out.println("\nEmployee object serialized successfully.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        // Read the file and display its contents
        try {
            FileInputStream fis = new FileInputStream("io-streams\\files\\emp.ser");
            ObjectInputStream in = new ObjectInputStream(fis);
            Employee emp1 = (Employee) in.readObject();
            System.out.println("\nEmployee object deserialized successfully.");
            System.out.println(emp1);
            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
