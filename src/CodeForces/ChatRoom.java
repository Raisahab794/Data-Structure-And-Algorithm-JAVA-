package CodeForces;
import java.util.Scanner;
public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String hello = "hello";
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == hello.charAt(j)) {
                j++;
            }
            if (j == hello.length()) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
