package CodeForces;
import java.util.Scanner;
public class InSereachOfEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isHard = false;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1) {
                isHard = true;
            }
        }
        if (isHard) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
    }
}
