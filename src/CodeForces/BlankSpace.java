package CodeForces;
import java.util.*;
public class BlankSpace {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt(); // Number of test cases
            while (t-- > 0) {
                int n = sc.nextInt(); // Length of the array
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                int maxBlankSpace = 0, currentBlankSpace = 0;
                for (int num : a) {
                    if (num == 0) {
                        currentBlankSpace++;
                        maxBlankSpace = Math.max(maxBlankSpace, currentBlankSpace);
                    } else {
                        currentBlankSpace = 0;
                    }
                }
                System.out.println(maxBlankSpace); // Output the length of the longest blank space
            }
            sc.close();
        }
    }

