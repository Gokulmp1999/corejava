package ibm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple:15", "banana:16", "cherry:18", "date:56");
        Map<String,String> map=new HashMap<>();
        for(String v:list){

            String[] s=v.split(":");
            map.put(s[0],s[1]);

        }
        System.out.println(map);

        Map<String,String> mapWithStream=list.stream().map(x->x.split(":")).filter(f->f.length==2)
                .collect(Collectors.toMap(p->p[0],p->p[1]));
        mapWithStream.forEach((k,v)->{
            System.out.println("Key : "+k +" value : "+v);
        });
    }
}
