package practice2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmploye {


    public static void main(String[] args) {
        List<Employ> employList= Arrays.asList(new Employ("a",500)
        ,new Employ("b",1000),
                new Employ("c",10));

        Comparator<Employ> employComparator=new Comparator<Employ>() {
            @Override
            public int compare(Employ o1, Employ o2) {
                if(o2.getSalary()> o1.getSalary()){
                    return 1;
                }else {
                    return -1;
                }
            }
        };

//        System.out.println(employList.stream().sorted(employComparator).collect(Collectors.toList()));
    }
}

class Employ{
    private String name;
    private int salary;

    public Employ(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
