import javax.annotation.processing.ProcessingEnvironment;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 1234;

        int reversed = reverse(num);
        System.out.print(reversed);
    }

    // keep in mind the question asked for 32 bit integers
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

}
