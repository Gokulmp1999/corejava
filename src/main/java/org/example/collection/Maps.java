package org.example.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Gokul", 99);
        map.put("sneha", 58);
        map.put("mp", 60);
        map.put("A", 40);
        map.put(null,null);
        System.out.println(map);

        if (map.containsKey("A")){
            map.remove("A");
        }
        System.out.println(map);
//        for (String name : map.keySet()) {
//            System.out.println(name + " : " + map.get(name));
//        }
//        Map<String,Integer> map2=new TreeMap<>();
//        map2.put("g",50);
//        map2.put(null,null);
//        System.out.println(map2);
//        for (Map.Entry<String, Integer> name:map2.entrySet()){
//            System.out.println(name.getKey()+" : "+name.getValue());
//        }
    }
    }

