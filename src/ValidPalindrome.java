import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Statement");

        String words = myObj.nextLine();
        System.out.println("Is a Palindrome: " + isPalindrome(words)); // Output user input
    }

    public static boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;

        while (start < end) {
            char l = s.charAt(start), r = s.charAt(end);
            if (!Character.isLetterOrDigit(l)) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(r)) {
                end--;
                continue;
            }
            if (Character.toLowerCase(l) != Character.toLowerCase(l))
                return false;
            start++;
            end--;

        }
        return true;
    }

}
