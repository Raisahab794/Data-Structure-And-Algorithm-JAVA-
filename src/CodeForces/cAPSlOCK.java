package CodeForces;
import java.util.Scanner;
public class cAPSlOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = true;
        for(int i = 1; i < s.length(); i++) {
            if(Character.isLowerCase(s.charAt(i))) {
                flag = false;
                break;
            }
        }
        if(flag) {
            if(Character.isLowerCase(s.charAt(0))) {
                System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase());
            } else {
                System.out.println(s.toLowerCase());
            }
        } else {
            System.out.println(s);
        }
    }
}
