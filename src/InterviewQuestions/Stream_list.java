package InterviewQuestions;
import java.util.*;
import java.util.stream.Collectors;

public class Stream_list {

    public static List<Integer> filterAndSortDesc(List<Integer> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .filter(n -> n > 10)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(5, 42, 11, 10, 100, 9, 42, null);
        System.out.println(filterAndSortDesc(input)); // [100, 42, 42, 11]
    }
}
