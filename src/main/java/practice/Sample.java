package practice;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
//        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
//        Boolean number=list.stream().noneMatch(x->x==7);
//        Boolean number1=list.stream().anyMatch(x->x==7);
//        System.out.println(number);
//        System.out.println(number1);
//        List<List<Integer>> list1 = new ArrayList<>();
//        list1.add(new ArrayList<>(Arrays.asList(2, 5, 6)));
//        list1.add(new ArrayList<>(Arrays.asList(5, 7, 9)));
//        list1.stream().forEach(x->x.clear());
//        List<Integer> flattenedList=list1.stream().flatMap(List::stream).collect(Collectors.toList());

//    Optional<String> name=null;
//    if(name.isPresent()){
//        System.out.println(name.isPresent());
//    }else {
//        System.out.println(name.isPresent());
//    }
//    }
        List<Integer> nu = new ArrayList<>();
        nu.add(101);
        nu.add(1);
        nu.add(5);
        nu.add(6);
        nu.add(161);
        nu.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(x -> System.out.println(x));

//        int min=nu.stream().min((Integer::compareTo)).get();
//        int max=nu.stream().max(Integer::compareTo).get();
//        Boolean check=nu.stream().anyMatch(x->x==2);
//        Boolean check=nu.stream().allMatch(x->x%2!=0);
//        List<Integer> num=nu.stream().limit(2).collect(Collectors.toList());
//        System.out.println(num);
//        List<Integer> num=nu.stream().filter(x->x%2==0).collect(Collectors.toList());
//        System.out.println("check "+num);
//        System.out.println("nu "+nu);
        LocalDate date1 = LocalDate.of(2020, 7, 15);
        LocalDate date2 = LocalDate.of(2021, 8, 16);
        Long diff= ChronoUnit.DAYS.between(date1,date2);
        Period dif = Period.between(date1, date2);
        int yr = dif.getYears();
        int d = dif.getDays();
        int m = dif.getMonths();

//        System.out.println(yr);
//        System.out.println(d);
//        System.out.println(m);
//        int a=nu.stream().max(Integer::compareTo).get();
//        System.out.println(a);

    }
}
