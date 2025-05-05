package CodeForces;
import java.util.*;
public class A43 {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read the number of goals
        int n = sc.nextInt();
        sc.nextLine();  // Consume the remaining newline

        // Create a map to store the number of goals for each team
        Map<String, Integer> goalCount = new HashMap<>();

        // Process each goal description
        for (int i = 0; i < n; i++) {
            String teamName = sc.nextLine().trim();
            goalCount.put(teamName, goalCount.getOrDefault(teamName, 0) + 1);
        }

        // Find the team with the maximum number of goals
        String winner = "";
        int maxGoals = -1;

        for (Map.Entry<String, Integer> entry : goalCount.entrySet()) {
            if (entry.getValue() > maxGoals) {
                maxGoals = entry.getValue();
                winner = entry.getKey();
            }
        }

        // Output the winner team
        System.out.println(winner);

        // Close the scanner
        sc.close();
    }
}
