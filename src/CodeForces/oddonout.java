package CodeForces;
import java.util.*;
public class oddonout {

        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(int i=0;i<t;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                if((a|b)==a)System.out.println(c);
                else System.out.println(a);
            }
        }
}
