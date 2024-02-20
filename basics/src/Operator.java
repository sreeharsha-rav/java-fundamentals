/*
 * Program that accepts 2 numbers and an operator from the command line and performs the operation.
 */
public class Operator {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String operator = args[2];
        int result = 0;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Invalid Operator");
                System.exit(0);
        }

        System.out.println("Result of " + a + " " + operator + " " + b + " is: " + result);
    }
}
