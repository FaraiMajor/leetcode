import java.net.SocketPermission;
import java.util.*;

// public class reverseVowel {

//     public static String reverseVowels(String s) {
//         char[] str = s.toCharArray();

//         int high = str.length - 1;
//         int low = 0;

//         while (low < high) {
//             if (isVowel(str[low]) && isVowel(str[high])) {
//                 char temp = str[low];
//                 str[low] = str[high];
//                 str[high] = temp;
//                 high--;
//                 low++;
//             } else if (!isVowel(str[low]))
//                 low++;
//             else if (!isVowel(str[high]))
//                 high--;
//         }
//         return new String(str);
//     }

//     public static boolean isVowel(char c) {
//         c = Character.toLowerCase(c);
//         return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
//     }

//     public static void main(String[] args) {
//         String s = "leetcode";
//         System.out.print(reverseVowels(s));
//     }
// }

// Using Sets
public class reverseVowel {
    public static String reverseVowels(String s) {
        // convert string into an array of characters
        char[] str = s.toCharArray();
        // make a set of vowels
        Set<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        // push all vowels found in the string to a stack
        Stack<Character> stack = new Stack<Character>();
        for (char c : str) {
            if (vowels.contains(c))
                stack.push(c);
        }
        // pop top of the stack when we encounter a vowel thus swapping first and last
        for (int i = 0; i < str.length; i++) {
            if (vowels.contains(str[i])) {
                str[i] = stack.pop();
            }
        }
        return new String(str);
    }

    public static void main(String args[]) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));

    }
}