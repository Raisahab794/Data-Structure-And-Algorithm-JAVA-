package CodeForces;
import java.util.*;
public class AntonandPolyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int faces = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("Tetrahedron")) {
                faces += 4;
            } else if (s.equals("Cube")) {
                faces += 6;
            } else if (s.equals("Octahedron")) {
                faces += 8;
            } else if (s.equals("Dodecahedron")) {
                faces += 12;
            } else if (s.equals("Icosahedron")) {
                faces += 20;
            }
        }
        System.out.println(faces);
        sc.close();
    }
}
