package practice2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortBasedLastValue {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,65,3101,92,13,126);
//        Comparator<Integer> lastDigitComparator = Comparator.comparingInt(number -> number % 10);
        Comparator<Integer> lasIntegerComparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10){
                    return 1;
                }else {
                    return -1;
                }
            }
        };
        list.stream().sorted(lasIntegerComparator).forEach(x-> System.out.println(x));

    }
}
