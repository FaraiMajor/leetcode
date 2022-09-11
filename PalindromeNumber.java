import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter number");

        int num = myObj.nextInt(); // Read user input
        System.out.println(num + " is a Palindrome: " + isPalindrome(num)); // Output user input
    }

    public static boolean isPalindrome(int x) {
        if (x == 0)
            return true;

        if (x < 0 || x % 10 == 0)
            return false;

        int rev = 0;
        while (x > rev) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }
        if (x == rev || x == rev / 10) {
            return true;
        } else {
            return false;
        }
    }

}
