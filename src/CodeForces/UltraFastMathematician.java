package CodeForces;
import java.util.Scanner;
public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                result += "0";
            } else {
                result += "1";
            }
        }
        System.out.println(result);
        sc.close();
    }
}
