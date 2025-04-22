package CodeForces;
import java.util.*;

    public class DislikeofThrees {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt(); // number of test cases
            int[] sequence = new int[1000];
            int index = 0, num = 1;

            // Generate the sequence of numbers
            while (index < 1000) {
                if (num % 3 != 0 && Integer.toString(num).indexOf('3') == -1) {
                    sequence[index++] = num;
                }
                num++;
            }

            // Process each test case
            for (int i = 0; i < t; i++) {
                int k = scanner.nextInt();
                System.out.println(sequence[k - 1]); // Output the k-th element
            }
        }
    }
