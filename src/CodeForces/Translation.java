package CodeForces;
import java.util.*;
public class Translation{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        StringBuilder sb = new StringBuilder(s2);
        sb.reverse();
        if(s1.equals(sb.toString())){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
