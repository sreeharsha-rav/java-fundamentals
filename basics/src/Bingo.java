/*
 * Program that accepts a number in the range 1 to 50 from the command line and displays the bingo number.
 * The bingo number is defined in an array of 5 integer values ranging from 1 to 50.
 */
public class Bingo {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int[] bingo = {5, 10, 15, 20, 25};

        if (num < 1 || num > 50) {
            System.out.println("Invalid Input. Number should be in the range 1 to 50");
            System.exit(0);
        }

        for (int i = 0; i < bingo.length; i++) {
            if (bingo[i] == num) {
                System.out.println("BINGO");
                System.exit(0);
            }
        }

        System.out.println("Not a bingo number");
    }
}
