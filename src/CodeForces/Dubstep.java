package CodeForces;
import java.util.*;
public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("WUB", " ");
        s = s.trim();
        System.out.println(s);
    }
}
