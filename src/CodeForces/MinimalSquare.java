package CodeForces;
import java.util.*;
public class MinimalSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int sideLength = Math.max(n, m);
        int squaresFit = (sideLength * sideLength) / (k * k);
        System.out.println(squaresFit);
    }
}
