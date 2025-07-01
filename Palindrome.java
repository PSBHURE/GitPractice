import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        // Normalize the input: remove spaces, punctuation, and lowercase it
        String cleaned = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        // Check if it's a palindrome
        boolean isPalindrome = isPalindrome(cleaned);

        if (isPalindrome) {
            System.out.println("✅ It's a palindrome!");
        } else {
            System.out.println("❌ It's not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
        // adding cooment
    }
}
