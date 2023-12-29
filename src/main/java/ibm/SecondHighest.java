package ibm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,6,3,9,13,1200,100);
        System.out.println(list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst());
    }
}
