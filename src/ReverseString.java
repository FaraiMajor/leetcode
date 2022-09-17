import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }
    public static void reverseString(char[] s) {

        int start = 0, end = s.length -1;

        while(start < end){
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }
        System.out.print(Arrays.toString(s));
    }
}
