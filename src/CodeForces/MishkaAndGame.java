package CodeForces;
import java.util.*;
public class MishkaAndGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mishkaScore = 0;
        int chrisScore = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) {
                mishkaScore++;
            } else if (b > a) {
                chrisScore++;
            }
        }

        if (mishkaScore > chrisScore) {
            System.out.println("Mishka");
        } else if (chrisScore > mishkaScore) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
    }
}
