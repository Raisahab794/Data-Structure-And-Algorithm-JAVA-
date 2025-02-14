package CodeForces;
import java.util.Scanner;
public class submitSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();;
        if(n%2==0){
            int evennumber=(int)(n/2);
            int oddnumber=(int)(n/2);
             int evensum=(evennumber*(evennumber+1));
             int oddsum=(oddnumber*oddnumber);
                System.out.println(evensum-oddsum);
        }else{
            int evennumber=(int)(n/2);
            int oddnumber=(int)(n/2)+1;
             int evensum=(evennumber*(evennumber+1));
             int oddsum=(oddnumber*oddnumber);
                System.out.println(evensum-oddsum);
        }
        }
}
