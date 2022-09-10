import java.net.SocketPermission;
import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int secondNum = target - nums[i];
            if (map.containsKey(secondNum) && map.get(secondNum) != i) {
                return new int[] { map.get(secondNum), i };
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] a = { 1, 4, 5, 11, 12 };
        int target = 9;
        for (int x : twoSum(a, target))
            System.out.print(x + " ");
    }
}