package CodeForces;
import java.util.*;
public class DoNotBeDistracted {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read number of test cases
            int t = scanner.nextInt();
            scanner.nextLine();  // Consume the remaining newline character

            // Process each test case
            for (int i = 0; i < t; i++) {
                // Read number of days
                int n = scanner.nextInt();
                scanner.nextLine();  // Consume the remaining newline character

                // Read the task sequence for the current test case
                String tasks = scanner.nextLine();

                // Set to track tasks Polycarp has already finished
                Set<Character> seen = new HashSet<>();
                char lastTask = '\0';  // To track the last task solved
                boolean suspicious = false;

                for (int j = 0; j < n; j++) {
                    char currentTask = tasks.charAt(j);

                    // If the task is different from the last task and it's already in 'seen', it's suspicious
                    if (currentTask != lastTask) {
                        if (seen.contains(currentTask)) {
                            suspicious = true;
                            break;
                        }
                        // Add the last task to the 'seen' set
                        if (lastTask != '\0') {
                            seen.add(lastTask);
                        }

                    }
                }

                // Output result based on whether we detected any suspicious behavior
                if (suspicious) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }

            scanner.close();
        }
    }


