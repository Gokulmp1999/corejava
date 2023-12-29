package practice2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CuncurrentHashMapMain {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<>();

        map.put("Delhi", 12);
        map.put("Moscow", 11);
        map.put("New York", 111);
        for (Map.Entry<String,Integer> maps: map.entrySet()){
            map.put("s",1);
        }
        System.out.println(map);
    }
}
