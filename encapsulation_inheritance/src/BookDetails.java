public class BookDetails {
    public static void main(String[] args) {
        // Create an array of 3 Book objects
        Book[] books = new Book[3];
        // Input data for 3 books
        books[0] = new Book(101, "Java Programming", "Smith", 500);
        books[1] = new Book(102, "Python Programming", "Brown", 400);
        books[2] = new Book(103, "C Programming", "Johnson", 300);
        // Display details of 3 books
        System.out.println("Details of 3 books:");
        for (Book book : books) {
            System.out.println(book);
        }
        // Display total number of books
        System.out.println("Total number of books: " + Book.getBookCount());

        // Create an array of 3 EngineeringBook objects
        EngineeringBook[] engBooks = new EngineeringBook[3];
        // Input data for 3 engineering books
        engBooks[0] = new EngineeringBook(201, "Java Programming", "Smith", 500, "Computer Science");
        engBooks[1] = new EngineeringBook(202, "Python Programming", "Brown", 400, "Computer Science");
        engBooks[2] = new EngineeringBook(203, "C Programming", "Johnson", 300, "Computer Science");
        // Display details of 3 engineering books
        System.out.println("Details of 3 engineering books:");
        for (EngineeringBook engBook : engBooks) {
            System.out.println(engBook);
        }
        // Display total number of books
        System.out.println("Total number of books: " + Book.getBookCount());
        
    }   
}
