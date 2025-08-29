import java.util.Scanner;

public class StringPalindrome {

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String s) {
        // Step 1: Remove all non-alphanumeric characters and convert to lowercase
        // This ensures we ignore spaces, punctuation, and case
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Reverse the cleaned string using StringBuilder
        String s2 = new StringBuilder(s1).reverse().toString();

        // Step 3: Compare original cleaned string with its reverse
        return s1.equals(s2); // returns true if palindrome, false otherwise
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input
        StringPalindrome sp = new StringPalindrome(); // Create object to call isPalindrome

        // Ask user how many strings they want to check
        System.out.print("How many Strings you want to check?- ");
        int n = sc.nextInt(); 
        sc.nextLine(); // Consume the leftover newline after nextInt()

        // Loop to accept multiple strings
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter " + i + " String: "); // Prompt user
            String s = sc.nextLine(); // Read the string

            boolean result = sp.isPalindrome(s); // Check if the string is a palindrome
            System.out.println("Is Palindrome? " + result); // Print the result
        }
        sc.close();
    }
}
