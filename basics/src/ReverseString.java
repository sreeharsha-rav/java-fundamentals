/*
 * Program to reverse each word in a set of 5 words from the command line.
 * Arrange the resulting words in alphabetical order.
 */
public class ReverseString {
    public static void main(String[] args) {
        String[] words = new String[args.length];
        String[] reverseWords = new String[args.length];
        String temp = "";
        int i, j;
        // Store the words in an array
        for (i = 0; i < args.length; i++) {
            words[i] = args[i];
            reverseWords[i] = "";
        }
        // Reverse each word
        for (i = 0; i < words.length; i++) {
            for (j = words[i].length() - 1; j >= 0; j--) {
                reverseWords[i] += words[i].charAt(j);
            }
        }
        // Sort the words in alphabetical order
        for (i = 0; i < reverseWords.length; i++) {
            for (j = i + 1; j < reverseWords.length; j++) {
                if (reverseWords[i].compareTo(reverseWords[j]) > 0) {
                    temp = reverseWords[i];
                    reverseWords[i] = reverseWords[j];
                    reverseWords[j] = temp;
                }
            }
        }

        System.out.println("Words in alphabetical order after reversing each word: ");
        for (i = 0; i < reverseWords.length; i++) {
            System.out.println(reverseWords[i]);
        }
    }
}
