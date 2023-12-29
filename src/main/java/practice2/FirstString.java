package practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstString {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(15,20,14,11,300);
//        List<Integer> list1=list.stream().map(s->s+"")
//                .filter(s->s.endsWith("0")).map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> list1=list.stream().filter(x->x%10==0).collect(Collectors.toList());
        List<Integer> list2=list.stream().filter(x->String.valueOf(x).startsWith("1")).collect(Collectors.toList());
        System.out.println(list2);
    }
}
