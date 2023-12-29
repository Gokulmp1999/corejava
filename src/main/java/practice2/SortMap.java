package practice2;

import java.util.*;
import java.util.stream.Collectors;

public class SortMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("sssss",5);
        map.put("ss",2);
        map.put("ss",2);
        map.put("sssssss",50);
        map.put("sssssskss",53);
        Map<String, Integer> sortedMapRe = map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(integer, integer2) -> integer,LinkedHashMap::new));

        System.out.println(sortedMapRe);
        Map<String, Integer> sortedMapByKey = map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println(sortedMapByKey);
//        Map<String, Integer> collect = map.entrySet().stream().sorted(Collections.reverseOrder()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//        System.out.println(collect);
    }
}
