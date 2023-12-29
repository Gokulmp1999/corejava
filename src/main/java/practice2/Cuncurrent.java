package practice2;

import java.util.ArrayList;
import java.util.List;

public class Cuncurrent {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        List<Integer> originalList2 = new ArrayList<>();
        for(Integer i:originalList){
            originalList2.add(i*2);
        }
    }
}
