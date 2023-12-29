package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> n= Arrays.asList(30,20,50,100,70);
        System.out.println(n.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get());
    }
}
