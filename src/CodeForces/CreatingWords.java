package CodeForces;
import java.util.*;
public class CreatingWords {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();  // Read the number of test cases
            sc.nextLine();  // Consume the leftover newline

            for (int i = 0; i < t; i++) {
                // Read the strings a and b
                String[] input = sc.nextLine().split(" ");
                String a = input[0];
                String b = input[1];

                // Swap the first characters
                String swappedA = b.charAt(0) + a.substring(1);
                String swappedB = a.charAt(0) + b.substring(1);

                // Output the results
                System.out.println(swappedA + " " + swappedB);
            }
        }
    }


