package Leetcode;
import java.util.*;
public class FindTheNumberOfWayToPlaceThePeople2 {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int ans = 0;
        Arrays.sort(points, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
        for (int i = 0; i < n; i++) {
            int[] a = points[i];
            int xmin = a[0] - 1;
            int xmax = Integer.MAX_VALUE;
            int ymin = Integer.MIN_VALUE;
            int ymax = a[1] + 1;
            for (int j = i + 1; j < n; j++) {
                int[] b = points[j];
                if (b[0] > xmin && b[0] < xmax && b[1] > ymin && b[1] < ymax) {
                    ans++;
                    xmin = b[0];
                    ymin = b[1];
                }
            }
        }
        return ans;
    }
}
