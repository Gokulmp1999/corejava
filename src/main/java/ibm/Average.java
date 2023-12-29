package ibm;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Average {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,6,3,9,13,12,1,6,6);
        System.out.println(list.stream().mapToDouble(Integer::doubleValue).average());
    }
}
