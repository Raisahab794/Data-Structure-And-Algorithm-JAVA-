package CodeForces;

public class Hulk {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sb.append("I love ");
            } else {
                sb.append("I hate ");
            }
            if (i != n) {
                sb.append("that ");
            }
        }
        sb.append("it");
        System.out.println(sb);
        sc.close();
    }
}
