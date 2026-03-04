import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = input.nextLine();
        boolean isPalindrome = true;

        for (int i = word.length()-1; i >= 0 ; i--)
        {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i))
            {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
        {
            System.out.println(word + " is a palindrome.");
        }
        else
        {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
