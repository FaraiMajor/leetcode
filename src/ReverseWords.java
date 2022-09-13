import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");

        String s = scan.nextLine();
        System.out.print(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] words = s.split("\\W+");
        Deque<String> stack = new LinkedList<>();

        for (int i = 0; i < words.length; i++) {
            stack.push(words[i]);
        }
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            String ans = stack.pop();
            builder.append(ans).append(" ");
        }

        return builder.toString().trim();
    }
}