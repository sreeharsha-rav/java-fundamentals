public class Book {
    private int bookNo;
    private String title;
    private String author;
    private float price;

    // Static variable
    private static int bookCount = 0;
    public static int getBookCount() {
        return bookCount;
    }

    // Constructor
    public Book(int bookNo, String title, String author, float price) {
        this.bookNo = bookNo;
        if (title.length() < 4) {
            System.out.println("Error: Title must have at least 4 characters");
        } else {
            this.title = title;
        }
        if (price < 1 || price > 5000) {
            System.out.println("Error: Price must be in the range 1 to 5000");
        } else {
            this.price = price;
        }
        this.author = author;
        bookCount++;    // Increment book count
    }

    // Getters
    public int getBookNo() {
        return bookNo;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public float getPrice() {
        return price;
    }

    // Setters
    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book details:" + "\n"
                + "Book No: " + bookNo + "\n"
                + "Title: " + title + "\n"
                + "Author: " + author + "\n"
                + "Price: " + price;
    }
}
