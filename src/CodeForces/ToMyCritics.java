package CodeForces;
import java.util.*;
public class ToMyCritics {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a+b>=10||a+c>=10)System.out.print("YES");
            else if(b+c>=10)System.out.print("YES");
            else System.out.print("NO");
        }
    }

