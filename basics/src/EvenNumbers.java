/*
 * Program to list all even numbers less than or equal to the number n.
 */

import java.util.Vector;

public class EvenNumbers {
    public static void main (String[] args) {
        int num = Integer.parseInt(args[0]);
        Vector<Integer> result = new Vector<Integer>();

        if (num < 0) {
            System.out.println("Invalid Input. Number should be greater than zero");
        }

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }

        System.out.println("Even numbers less than or equal to " + num + " are: " + result);
    }   
}