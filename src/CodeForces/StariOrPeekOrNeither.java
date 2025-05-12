package CodeForces;
import java.util.*;
public class StariOrPeekOrNeither {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            // Loop through each test case
            for (int i = 0; i < t; i++) {
                // Read the three digits a, b, c
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                // Check the conditions and output the result
                if (a < b && b < c) {
                    System.out.println("STAIR");
                } else if (a < b && b > c) {
                    System.out.println("PEAK");
                } else {
                    System.out.println("NONE");
                }
            }

            // Close the scanner
            sc.close();
        }
    }


