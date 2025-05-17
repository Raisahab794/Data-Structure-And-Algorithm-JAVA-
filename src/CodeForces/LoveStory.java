package CodeForces;
import java.util.*;
public class LoveStory {


        // Function to count differences between string s and "codeforces"
        public static int countDifferences(String s) {
            String target = "codeforces";
            int count = 0;
            for (int i = 0; i < 10; i++) {
                if (s.charAt(i) != target.charAt(i)) {
                    count++;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Reading the number of test cases
            int t = sc.nextInt();
            sc.nextLine(); // Consume the remaining newline

            // Process each test case
            for (int i = 0; i < t; i++) {
                String s = sc.nextLine(); // Reading the string for the test case
                System.out.println(countDifferences(s));
            }

            sc.close();
        }

}
