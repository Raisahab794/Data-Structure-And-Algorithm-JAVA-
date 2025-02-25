
package CodeForces;
import java.util.*;
public class NumberOnWhiteboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<Integer> results = new ArrayList<>();
        List<List<int[]>> operationsList = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for (int j = 1; j <= n; j++) {
                maxHeap.add(j);
            }

            List<int[]> operations = new ArrayList<>();
            while (maxHeap.size() > 1) {
                int a = maxHeap.poll();
                int b = maxHeap.poll();
                int newNumber = (a + b + 1) / 2;
                maxHeap.add(newNumber);
                operations.add(new int[]{a, b});
            }

            results.add(maxHeap.poll());
            operationsList.add(operations);
        }

        for (int i = 0; i < t; i++) {
            System.out.println(results.get(i));
            for (int[] operation : operationsList.get(i)) {
                System.out.println(operation[0] + " " + operation[1]);
            }
        }
    }
}
