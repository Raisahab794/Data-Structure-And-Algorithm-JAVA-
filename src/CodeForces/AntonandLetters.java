package CodeForces;
import java.util.*;
public class AntonandLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.substring(1, s.length()-1);
        if(s.length() == 0) {
            System.out.println(0);
            return;
        }
        String[] arr = s.split(", ");
        Set<String> set = new HashSet<>();
        for(String str : arr) {
            set.add(str);
        }
        System.out.println(set.size());
    }
}
