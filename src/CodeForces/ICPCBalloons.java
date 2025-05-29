package CodeForces;
import java.util.*;
public class ICPCBalloons {

       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int t = sc.nextInt(); // Number of test cases
           while (t-- > 0) {
               String s = sc.next(); // Order of solved problems
               Set<Character> solvedProblems = new HashSet<>();
               int balloons = 0;

               for (char problem : s.toCharArray()) {
                   if (solvedProblems.contains(problem)) {
                       balloons += 1; // Already solved, add 1 balloon
                   } else {
                       solvedProblems.add(problem);
                       balloons += 2; // First time solved, add 2 balloons
                   }
               }

               System.out.println(balloons);
           }
           sc.close();
       }
   }

