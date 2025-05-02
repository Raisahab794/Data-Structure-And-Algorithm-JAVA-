package CodeForces;
import java.util.*;
public class TeamOlympiad {

        public static void main(String[] args) {
            // Read input
            Scanner sc = new Scanner(System.in);

            // Number of children
            int n = sc.nextInt();

            // Array to store the skill levels of each child
            int[] skills = new int[n];

            for (int i = 0; i < n; i++) {
                skills[i] = sc.nextInt();
            }

            // Form teams
            formTeams(n, skills);
        }

        public static void formTeams(int n, int[] skills) {
            // Lists to hold the indices of students by their skills
            List<Integer> programmers = new ArrayList<>();
            List<Integer> mathematicians = new ArrayList<>();
            List<Integer> sportsmen = new ArrayList<>();

            // Classify students based on their skills
            for (int i = 0; i < n; i++) {
                if (skills[i] == 1) {
                    programmers.add(i + 1);  // store 1-based index
                } else if (skills[i] == 2) {
                    mathematicians.add(i + 1);  // store 1-based index
                } else if (skills[i] == 3) {
                    sportsmen.add(i + 1);  // store 1-based index
                }
            }

            // The maximum number of teams is the minimum size of the three lists
            int teamsCount = Math.min(Math.min(programmers.size(), mathematicians.size()), sportsmen.size());

            // Output the number of teams
            System.out.println(teamsCount);

            // Form and print the teams
            for (int i = 0; i < teamsCount; i++) {
                System.out.println(programmers.get(i) + " " + mathematicians.get(i) + " " + sportsmen.get(i));
            }
        }
    }


