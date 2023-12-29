package practice1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpMain {
    public static void main(String[] args) {
        List<Employe> employeList = Arrays.asList(
                new Employe("a", 2000),
                new Employe("d", 1800),
                new Employe("e", 1000),
                new Employe("f", 5000)
        );

        Collections.sort(employeList);
        System.out.println(employeList);

//        Comparator<Employe> comparator=new Comparator<Employe>() {
//            @Override
//            public int compare(Employe o1, Employe o2) {
//                if(o2.getSalary()>o1.getSalary()){
//                    return 1;
//                }else {
//                    return -1;
//                }
//            }
//        };
//        List<Employe> collect = employeList.stream().sorted((o1, o2) -> o2.getSalary()- o1.getSalary()).skip(2).collect(Collectors.toList());
//        System.out.println(collect.stream().findFirst().map(x->x.getName()).get());
    }
}
