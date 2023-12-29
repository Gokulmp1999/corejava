package practice3;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(20,30,10,20,30,1,1,2,2);
        Set<Integer> d= list.stream().filter(x-> Collections.frequency(list,x)>1).collect(Collectors.toSet());
        d.stream().forEach(x-> System.out.println(x));
//        System.out.println("min "+d.stream().min(Integer::compareTo).get());
//        System.out.println("max "+d.stream().max(Integer::compareTo).get());
        System.out.println("second largest "+d.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get());
        System.out.println("second mini "+d.stream().sorted().skip(1).findFirst().get());



    }
}
class PrintCount{
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(20,30,10,20,30,1);
        Set<Integer> integerSet=new HashSet<>(list);
        Set<Integer> d= list.stream().filter(x-> Collections.frequency(list,x)>1).collect(Collectors.toSet());
        integerSet.stream().forEach(x-> System.out.println("value "+x+" count "+Collections.frequency(list,x)));
    }
}
