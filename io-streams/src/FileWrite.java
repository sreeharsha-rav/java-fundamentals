import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        // Read 5 lines from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 lines of text: ");
        String[] lines = new String[5];
        for(int i = 0; i < 5; i++) {
            lines[i] = scanner.nextLine();
        }

        // Write the lines to a file
        File file = new File("letter.txt");
        try {
            FileWriter writer = new FileWriter(file);
            for(String line : lines) {
                writer.write(line + "\n");
            }
            writer.close();
            System.out.println("\nFile written successfully to letter.txt .");
        } catch(Exception ex) {
            System.out.println("\nAn error occurred while writing to the file.");
            ex.printStackTrace();
        }
        scanner.close();

        // Read the file and display its contents
        try {
            Scanner fileScanner = new Scanner(file);
            System.out.println("\nContents of the file letter.txt:");
            while(fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch(Exception ex) {
            System.out.println("\nAn error occurred while reading the file.");
            ex.printStackTrace();
        }

        // Delete the file
        if(file.delete()) {
            System.out.println("\nletter.txt file deleted successfully.");
        } else {
            System.out.println("\nAn error occurred while deleting the file.");
        }
    }
}
