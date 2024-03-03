import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {
    public static void main(String[] args) throws Exception {
        // Input source and destination file paths from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter source file path: ");
        String sourceFile = scanner.nextLine();
        System.out.println("Enter destination file path: ");
        String destinationFile = scanner.nextLine();

        File source = new File(sourceFile);
        File destination = new File(destinationFile);

        // Check if source file exists
        if(!source.exists()) {
            System.out.println("Source file does not exist.");
            System.exit(0);
        }
        // Check if destination file exists
        if(destination.exists()) {
            System.out.println("Destination file already exists. Overwrite? (yes/no)"); 
            try {
                String response = scanner.next();
                if(!response.equalsIgnoreCase("yes")) {
                    System.out.println("File not copied.");
                    scanner.close();
                    System.exit(0);
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        } else {
            // Create the destination file
            try {
                destination.createNewFile();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }

        // Copy the file
        try {
            FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(destination);

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();
            System.out.println("File copied successfully.");
        } catch(Exception ex) {
            System.out.println("An error occurred while copying the file.");
            ex.printStackTrace();
        }
        scanner.close();
    }
}
