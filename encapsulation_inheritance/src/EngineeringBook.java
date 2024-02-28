public class EngineeringBook extends Book {
    private String category;

    public EngineeringBook(int bookNo, String title, String author, float price, String category) {
        super(bookNo, title, author, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString() + ", Category: " + category;
    }
}
