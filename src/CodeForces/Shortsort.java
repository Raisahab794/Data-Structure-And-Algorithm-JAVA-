package CodeForces;
import java.util.*;
public class Shortsort {

        public static void main(String[] args) {
            // Scanner for input
            Scanner sc = new Scanner(System.in);

            // Read the number of test cases
            int t = sc.nextInt();

            // Process each test case
            for (int i = 0; i < t; i++) {
                // Read the string for the test case
                String s = sc.next();

                // If the string is already "abc", print YES
                if (s.equals("abc")) {
                    System.out.println("YES");
                } else {
                    // Count how many characters are in the wrong position compared to "abc"
                    int mismatchCount = 0;
                    for (int j = 0; j < 3; j++) {
                        if (s.charAt(j) != "abc".charAt(j)) {
                            mismatchCount++;
                        }
                    }

                    // If exactly two characters are out of place, one swap can solve it
                    if (mismatchCount == 2) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }

            // Close the scanner
            sc.close();
        }
    }


