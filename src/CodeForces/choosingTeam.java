package CodeForces;
import java.util.*;
public class choosingTeam {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Read n and k
            int n = sc.nextInt();
            int k = sc.nextInt();

            // Calculate the maximum participations a student can have and still be eligible
            int maxParticipations = 5 - k;

            // Read the list of participations
            int eligibleCount = 0;
            for (int i = 0; i < n; i++) {
                int participation = sc.nextInt();
                if (participation <= maxParticipations) {
                    eligibleCount++;
                }
            }

            // Calculate the maximum number of teams
            int maxTeams = eligibleCount / 3;

            // Output the result
            System.out.println(maxTeams);

            sc.close();
        }
    }


