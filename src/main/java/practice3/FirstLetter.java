package practice3;



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstLetter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Alice", "David");
        Map<Character, Long> collect = names.stream().collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.counting()));
        System.out.println(collect);
    }
}
