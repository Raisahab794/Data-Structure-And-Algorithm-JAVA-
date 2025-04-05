package CodeForces;
import java.util.*;
public class Lucky {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();  // Consume the newline character after reading the integer.

            for (int i = 0; i < n; i++) {
                String s = sc.nextLine();  // Read the next line of input as a string.

                // Ensure the string has at least 6 digits
                if (s.length() >= 6) {
                    // Extract the last three digits and the first three digits
                    int num1 = Integer.parseInt(s.substring(s.length() - 3));
                    int num2 = Integer.parseInt(s.substring(0, 3));

                    int sum1 = 0;
                    int sum2 = 0;

                    // Sum digits of num1 (last three digits)
                    while (num1 > 0) {
                        sum1 += (num1 % 10);
                        num1 /= 10;
                    }

                    // Sum digits of num2 (first three digits)
                    while (num2 > 0) {
                        sum2 += (num2 % 10);
                        num2 /= 10;
                    }

                    // Compare the sums and output the result
                    if (sum1 == sum2) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("Invalid input");
                }
            }
            sc.close();  // Close the scanner.
        }
    }


