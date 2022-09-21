public class LengthofLastWord {

    public static void main(String[] args) {
        String st = "Hello World";

        System.out.print(lengthOfLastWord(st));
    }
    public static int lengthOfLastWord(String s) {
        String [] arr = s.split(" ");
        String str = arr[arr.length -1];
        return str.length();

    }
}
