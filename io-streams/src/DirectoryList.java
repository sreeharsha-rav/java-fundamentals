import java.util.Scanner;
import java.io.File;

public class DirectoryList {
    public static void main(String[] args) {
        // Read a directory path from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter directory path: ");
        String directoryPath = scanner.nextLine();

        // Search for the directory
        File directory = new File(directoryPath);
        if(!directory.exists()) {
            System.out.println("Directory does not exist.");
            scanner.close();
            System.exit(0);
        }

        // If the directory exists, list all files and subdirectories
        File[] files = directory.listFiles();
        System.out.println("\nFiles and subdirectories in " + directoryPath + ":");
        for(File file : files) {
            if(file.isDirectory()) {
                System.out.println(file.getName() + " (Directory)");
            } else {
                System.out.println(file.getName() + " (File)");
            }
        }

        scanner.close();
    }
}
