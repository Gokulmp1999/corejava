package practice2;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesCount {
    public static void main(String[] args) {
//        List<Integer> list= Arrays.asList(1,6,3,9,13,12,1,6,6);
////        list.stream().forEach(x-> System.out.println(x +" count " + Collections.frequency(list,x)));
//        Set<Integer> set=list.stream().filter(x->Collections.frequency(list,x)>1).collect(Collectors.toSet());
//        if(set.size()>=1){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }
//        set.stream().forEach(x-> System.out.println(x+" count "+Collections.frequency(list,x)));

        List<String> list=Arrays.asList("a","k","a","b");
        Set<String> lStrings=new HashSet<>(list);
        System.out.println(lStrings.stream().min(String::compareTo).get());
        lStrings.stream().forEach(x-> System.out.println(x+" count "+Collections.frequency(list,x)));
    }
}
