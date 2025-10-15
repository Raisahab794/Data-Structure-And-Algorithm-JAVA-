package Leetcode;
import java.util.*;
public class Adjacent_Increasing_Subarrays_Detection_II {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int[] incLen = new int[n];
        incLen[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            incLen[i] = (nums.get(i) < nums.get(i + 1)) ? incLen[i + 1] + 1 : 1;
        }
        int left = 1, right = n / 2, res = 0;
        while (left <= right) {
            int k = (left + right) / 2;
            boolean found = false;
            for (int i = 0; i + 2 * k <= n; i++) {
                if (incLen[i] >= k && incLen[i + k] >= k) {
                    found = true;
                    break;
                }
            }
            if (found) {
                res = k;
                left = k + 1;
            } else {
                right = k - 1;
            }
        }
        return res;
    }
}
