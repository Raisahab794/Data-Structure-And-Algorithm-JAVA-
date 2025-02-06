package CodeForces;
import java.util.Scanner;
public class VanyaAndFence {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int h = s.nextInt();
        int width = 0;
        for(int i = 0; i < n; i++){
            int a = s.nextInt();
            if(a > h){
                width += 2;
            }else{
                width += 1;
            }
        }
        System.out.println(width);
    }
}
