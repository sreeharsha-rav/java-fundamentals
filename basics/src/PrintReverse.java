/*
 * Program to print the array of strings in reverse order.
    - Create an array of strings.
    - Display the elements of the reversed array.
    - Array: courses = {"Java Web Services", "Spring Data REST", "Hibernate", "Spring in easy steps"}
 */
public class PrintReverse {
    public static void main(String[] args) {
        String[] courses = {"Java Web Services", "Spring Data REST", "Hibernate", "Spring in easy steps"};
        for (int i = courses.length - 1; i >= 0; i--) {
            System.out.println(courses[i]);
        }
    }
}
