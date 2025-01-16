import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());  // Reading the number of statements
        int x = 0;

        for (int i = 0; i < n; i++) {
            String statement = reader.readLine();
            if (statement.contains("++")) {
                x++;
            } else if (statement.contains("--")) {
                x--;
            }
        }

        System.out.println(x);  // Output the final value of x
    }
}