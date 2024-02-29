public class Customer {
    private String custNo;
    private String custName;
    private String category;

    public Customer(String custNo, String custName, String category) throws InvalidInputException {
        // Validate custNo if starts with C
        if (!custNo.startsWith("C") && !custNo.startsWith("c")) {
            throw new InvalidInputException("Customer number must start with C");
        }

        // Validate cutName if length is lesser than 4
        if (custName.length() < 4) {
            throw new InvalidInputException("Customer name must be at least 4 characters long");
        }

        // Validate category if it is not a valid category
        if (!category.equalsIgnoreCase("Gold") && !category.equalsIgnoreCase("Platinum") && !category.equalsIgnoreCase("Silver")){
            throw new InvalidInputException("Category must be Gold, Platinum, or Silver");
        }

        // Set the values
        this.custNo = custNo;
        this.custName = custName;
        this.category = category;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custNo='" + custNo + '\'' +
                ", custName='" + custName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
