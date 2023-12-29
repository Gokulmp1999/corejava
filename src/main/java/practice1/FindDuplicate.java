package practice1;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(50);
        list.add(10);
        list.add(20);
        list.add(500);
        Set<Integer> integerSet=new HashSet<>(list);
//        System.out.println(integerSet.stream().map(x->x*x*x).collect(Collectors.toList()));
//        Set<Integer> dupl=list.stream().filter(x->Collections.frequency(list,x)>1).collect(Collectors.toSet());
//        list.removeAll(dupl);
//        Collections.sort(list,Collections.reverseOrder());
//        int minSecond=list.get(1);
//        System.out.println(minSecond);


//        List<String> stringList=new ArrayList<>();
//        stringList.add("goku");
//        stringList.add("abhi");
//        stringList.add("raji");
//        stringList.add("gokul");
//        stringList.add("raji");
//        System.out.println(stringList);
//        Set<String> dupli=stringList.stream().filter(x->Collections.frequency(stringList,x)>1).collect(Collectors.toSet());
////        System.out.println(dupli);
//        String min=stringList.stream().max(String::compareTo).get();
//        System.out.println(min);
//        Comparator<String> comparator=new Comparator<String>() {
//            @Override
//            public int compare(String o2, String o1) {
//                if(o2.length()<o1.length()){
//                    return 1;
//                }
//                else {
//                    return -1;
//                }
//            }
//        };
//        Collections.sort(stringList,comparator);

//        List<String> sourted=
//        list.stream().forEach(x->  System.out.println(x +" repeat "+ Collections.frequency(list,x)));
//        System.out.println(stringList);
    }
}
