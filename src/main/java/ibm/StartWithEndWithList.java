package ibm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithEndWithList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(15,20,14,11,300);
        System.out.println(list.stream().map(x->String.valueOf(x)).filter(x->x.startsWith("1")).collect(Collectors.toList()));
    }
}
