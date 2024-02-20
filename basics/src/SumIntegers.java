/*
 * Program to sum and avergae all integers from reading array of values from the command line.
 * Display the number of values less than the average.
 */
public class SumIntegers {
    public static void main(String[] args) {
        int[] numbers = new int[args.length];
        int sum = 0;
        int count = 0;
        double average = 0.0;

        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
            sum += numbers[i];
        }

        average = (double) sum / args.length;

        for (int i = 0; i < args.length; i++) {
            if (numbers[i] < average) {
                count++;
            }
        }

        System.out.println("Sum of all integers: " + sum);
        System.out.println("Average of all integers: " + average);
        System.out.println("Number of values less than the average: " + count);
    }
}
