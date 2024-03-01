## Exception Handling

### Objective:
Master the skills of handling pre-defined exceptions and creating custom exceptions in Java.

### Problems:

**1. ArrayIndexOutOfBoundsException Handling:**
- **Description:** Write a Java program to initialize an array of 10 integers and handle `ArrayIndexOutOfBoundsException` to prevent abnormal termination.
- **Task:** Implement a separate Java program `ThrowException` with a method that throws an exception but is not handled inside. Call this method from `main` and ensure appropriate exception handling.
- **Test Methods:** Validate the functionality in `TestException.java`.

**2. Customer Class with Validations:**
- **Description:** Create a class `Customer` with private members `custNo`, `custName`, and `category`.
- **Constructor:** Implement a parameterized constructor to initialize all instance variables.
- **Getters:** Provide getter methods for all instance variables.
- **Validations:** Perform the following validations in the constructor:
    - `custNo` must start with 'C' or 'c'.
    - `custName` must be at least 4 characters long.
    - `category` must be either 'Platinum', 'Gold', or 'Silver'.
- **Custom Exception:** Raise a user-defined exception `InvalidInputException` when any validation fails.
- **TestCustomer Class:** Create a class `TestCustomer` with a `main` method. Prompt the user to enter customer details, create a `Customer` object, perform validations, and print customer details.

