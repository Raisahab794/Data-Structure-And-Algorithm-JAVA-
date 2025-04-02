package CodeForces;
import java.util.*;
public class SerejaandDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }
        int sereja = 0, dima = 0;
        int left = 0, right = n - 1;
        boolean serejasTurn = true;
        while (left <= right) {
            if (serejasTurn) {
                sereja += cards[left] > cards[right] ? cards[left++] : cards[right--];
            } else {
                dima += cards[left] > cards[right] ? cards[left++] : cards[right--];
            }
            serejasTurn = !serejasTurn;
        }
        System.out.println(sereja + " " + dima);
    }
}
