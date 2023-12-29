package practice1;

import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(20,-1,5,100,55,-1000);
        int min=list.stream().min(Integer::compareTo).get();
        System.out.println(min);


        int max=list.stream().max(Integer::compareTo).get();
        System.out.println(max);
    }
}
