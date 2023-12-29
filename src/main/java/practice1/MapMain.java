package practice1;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put(null,null);
        map.put("1","2");
        map.put("1",null);

        System.out.println(map);
    }
}
