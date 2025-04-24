package CodeForces;
import java.util.*;
public class cloudberryJam {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int total=3*n;
            int ans=(total*2)/3;
            System.out.println(ans);
        }
    }
}
