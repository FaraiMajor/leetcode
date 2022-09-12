import java.util.Scanner;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3, n = 3;
        int[] nums2 = { 2, 5, 6 };
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = 0, index2 = 0;
        int k = 0;
        int len = n + m;
        int[] results = new int[len];

        while (index1 < m && index2 < n) {
            if (nums1[index1] < nums2[index2]) {
                results[k++] = nums1[index1++];
            } else {
                results[k++] = nums2[index2++];

            }
        }
        while (index1 < m) {
            results[k++] = nums1[index1++];
        }
        while (index2 < n) {
            results[k++] = nums2[index2++];
        }
        for (int i = 0; i < len; i++) {
            nums1[i] = results[i];
        }
        for (int arr : results) {
            System.out.print(arr);
        }
    }

}
