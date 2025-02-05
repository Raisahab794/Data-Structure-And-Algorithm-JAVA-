package CodeForces;
import java.util.Scanner;
public class Tram {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = 0;
        int current = 0;
        for(int i = 0; i < n; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            current = current - a + b;
            if(current > max){
                max = current;
            }
        }
        System.out.println(max);
    }
}
