public class Recording {
    public static void main(String[] args) {
        char[] arr = { 'A', 'a', 'w', 'w', 'C', 'c' };
        System.out.print(countChar(arr));
    }

    public static int countChar(char[] recording) {
        int count = 0;

        for (int i = 1; i < recording.length; i++) {
            if (Character.toLowerCase(recording[i - 1]) != Character.toLowerCase(recording[i])) {
                count++;
            }
        }
        return count;

    }

}
