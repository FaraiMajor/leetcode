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

// using two pointer O(N) for sorted Arrays
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1, sum;

        while (left < right) {
            sum = nums[left] + nums[right];
            if (sum == target)
                return new int[] { left, right };
            if (sum > target)
                right--;
            else
                left++;
        }
        return new int[] { -1, -1 };
    }

    public static void main(String args[]) {
        int[] a = { 1, 4, 5, 11, 12 };
        int target = 9;
        for (int x : twoSum(a, target))
            System.out.print(x + " ");
    }
}

// not efficient. time complexity is O(N * N) so best choice is to use hashmap
// or sets

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String args[]) {
        int[] a = { 1, 4, 5, 11, 12 };
        int target = 9;
        for (int x : twoSum(a, target))
            System.out.print(x + " ");
    }

}