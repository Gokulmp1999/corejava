package practice2;

import java.util.Arrays;
import java.util.List;

public class AverageMain {



    public static void main(String[] args) {
        List<Employe> employs= Arrays.asList(new Employe("m","It",2000),
                new Employe("m","It",2000),
                new Employe("p","devops",3000),
                new Employe("m","It",5000)
        );
        System.out.println(employs.stream().filter(x->x.getDepartment().equalsIgnoreCase("it")).mapToDouble(Employe::getSalary).average());
    }
}

class Employe{
    private String name;
    private String department;
    private int salary;

    public Employe(String name, String department,int salary) {
        this.name = name;
        this.department=department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
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

