package practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> original=new ArrayList<>();
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(1);
        original.add(2);
        original.add(0);
        System.out.println(original);
        System.out.println("before");
       original.stream().distinct().forEach(x->{
           System.out.println(x +" count = "+Collections.frequency(original,x));
       });

//        for (int n:distinct){
//            System.out.println(n +" count = "+Collections.frequency(original,n));
//
//        }
    }
}
class FindDuplicates{
    public static void main(String[] args) {
        List<Integer> number=new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(1);
        number.add(2);
        number.add(0);
        System.out.println("original "+number);
        Set<Integer> unique=new HashSet<>();
        List<Integer> duplicates=number.stream().filter(x->!unique.add(x)).collect(Collectors.toList());
        System.out.println("unique "+unique);
        System.out.println("duplicates "+duplicates);
        number.removeAll(duplicates);
        System.out.println("after removing dupicates "+number);

    }
}
class FindDuplicatesByGroupBy{
    public static void main(String[] args) {
        List<Integer> number=new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(1);
        number.add(2);
        number.add(0);
        Map<Integer,Long> map=number.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        List<Integer> duplicates=map.entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).collect(Collectors.toList());
        System.out.println("MapWithRepeated "+map);
        System.out.println("duplicates values " +duplicates);
    }
}
class SimpleWayToDuplicates{
    public static void main(String[] args) {
        List<Integer> number=new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(1);
        number.add(2);
        number.add(0);
        Set<Integer> duplicates=number.stream().filter(x->Collections.frequency(number,x)>1).collect(Collectors.toSet());
        System.out.println("duplicates " + duplicates);
    }
}
