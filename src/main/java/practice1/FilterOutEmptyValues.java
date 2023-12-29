package practice1;

import java.util.*;
import java.util.stream.Collectors;

public class FilterOutEmptyValues {
    public static void main(String[] args) {
//        List<Integer> list= Arrays.asList(1,null,2,6,3,null);
        Set<Integer> list=new TreeSet<>();
        list.add(10);
        list.add(15);
        list.add(2);
        list.add(5);
        list.add(null);

//        List<Integer> withOut=list.stream().filter(x->x!=null).collect(Collectors.toList());
//        List<String> list=Arrays.asList("g",null,"k","l",null);
//       List<String> withOut=list.stream().filter(x->x!=null).collect(Collectors.toList());
//        System.out.println(list);
//        System.out.println(withOut);
    }
}
