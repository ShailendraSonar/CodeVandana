public class PangramChecker {
    public static boolean isPangram(String input) {
        // Create an array to store whether each letter is present
        boolean[] isPresent = new boolean[26];

        // Convert the input to lowercase to handle both uppercase and lowercase letters
        input = input.toLowerCase();

        // Iterate through the characters in the input
        for (char ch : input.toCharArray()) {
            // Check if the character is a lowercase letter
            if ('a' <= ch && ch <= 'z') {
                // Mark the letter as present by setting the corresponding index in the array to true
                isPresent[ch - 'a'] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are present
        for (boolean letterPresent : isPresent) {
            if (!letterPresent) {
                return false; // At least one letter is missing
            }
        }

        return true; // All letters from 'a' to 'z' are present
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
