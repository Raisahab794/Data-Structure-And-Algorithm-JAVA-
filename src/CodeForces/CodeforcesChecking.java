package CodeForces;
import java.util.*;
public class CodeforcesChecking {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt(); // Read the number of test cases
            sc.nextLine(); // Consume the leftover newline character

            String s = "codeforces";

            for (int i = 0; i < t; i++) {
                String c = sc.nextLine(); // Read the string for the test case

                // Check if the string is a substring of "codeforces"
                if (s.contains(c)) {
                    System.out.println("yes");
                } else {
                    System.out.println("NO");
                }
            }
    }


}
