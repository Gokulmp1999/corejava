package synch;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedHashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("a",3);
        map.put("b",5);
        Map<String,Integer> synchMap= Collections.synchronizedMap(map);
        synchronized (synchMap){
            for (String key:synchMap.keySet()){
                System.out.println("Key "+synchMap.get(key));
            }
        }
    }
}
