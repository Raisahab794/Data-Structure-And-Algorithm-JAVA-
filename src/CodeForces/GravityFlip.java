package CodeForces;
import java.util.*;
public class GravityFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> cubes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cubes.add(scanner.nextInt());
        }
        Collections.sort(cubes);
        for (int cube : cubes) {
            System.out.print(cube + " ");
        }
    }
}
