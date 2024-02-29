## Concept: Abstraction & Polymorphism

## Objective:
Explore the concepts of abstraction and polymorphism through practical implementation.

### Problems:

**1. Medicine Abstract Class:**
- **Description:** Define an abstract class `Medicine` representing pharmaceutical products. It includes attributes such as price and expiry date, with a method `getDetails()` to retrieve these details.
- **Implementation:** Implement an abstract function `displayLabel()` within the `Medicine` class, allowing subclasses to print additional information specific to the type of medicine.
- **Usage Example:** Derive subclasses `Tablet`, `Syrup`, and `Ointment` from `Medicine`. Override the `displayLabel()` function in each subclass to print medicine-specific information.

**2. Shape Package:**
- **Description:** Create a package `com.shape` to handle geometric shapes. It contains interfaces and classes for calculating area and perimeter of polygons.
- **Components:** Includes an interface `Polygon` with methods `calcArea()` and `calcPerimeter()`, and classes `Square` and `Rectangle` implementing the interface.
- **Usage Example:** Utilize the `com.shape` package to instantiate objects of `Square` and `Rectangle`, and calculate their respective areas and perimeters.