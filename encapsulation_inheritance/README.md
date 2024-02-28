# Encapsulation & Inheritance

## Objective
- Implement classes & objects
- Make use of static members
- Use constructors for initializing an object
- Derive a class from an existing class

## Problems

### 1. Book Class
Create a class `Book` with private members `bookNo`, `title`, `author`, `price`. Provide getters and setters. Create a `BookDetails` class with `main` method to create `Book` object and initialize it by reading inputs from the user.

### 2. Book Constructor and Validations
Modify `Book` class to include a constructor for initializing instance variables. Perform validations:
- Title must have at least 4 characters
- Price must be in the range 1 to 5000

Print appropriate error message if validation fails. Override `toString()` to print book details.

### 3. Static Members
Add static members `bookCount` and `getBookCount()` to `Book` class. Write a static block to initialize `bookCount` to 0. Increment `bookCount` when a new `Book` object is created.

### 4. Book Array
Modify `main` method to create an array of 3 `Book` objects. Ask user to enter details and initialize them.

### 5. Book Search
Allow user to search for a book by entering book number. Print book details if number exists, otherwise print error message.

### 6. Engineering Book
Extend `Book` class to create `EngineeringBook` class with additional attribute `category`. Provide getters and setters for `category`. Create an object of `EngineeringBook` and test.
