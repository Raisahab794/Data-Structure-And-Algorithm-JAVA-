package CodeForces;
import java.util.*;
public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder result = new StringBuilder();
        boolean isNegative = s.charAt(0) == '-';
        for (int i = 0; i < s.length(); i++) {
            char digit = s.charAt(i);
            if (isNegative && digit > '4') {
                result.append((char) ('9' - digit + '0'));
            } else if (!isNegative && digit < '5') {
                result.append(digit);
            } else if (!isNegative) {
                result.append((char) ('9' - digit + '0'));
            } else {
                result.append(digit);
            }
        }
        System.out.println(result);
    }
}
