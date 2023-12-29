package practice3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Avg {
    public static void main(String[] args) {
        List<Emp> list= Arrays.asList(new Emp("Gokul","IT","24",25000),
                new Emp("rp","IT","23",26100),
                new Emp("nithul","IT","27",30000),
                new Emp("leo","vet","2",45000),
                new Emp("rcp","medical","27",261000),
                new Emp("Raj","edu","60",300000));
        System.out.println(list+" before");
//        double avg=list.stream().filter(x->x.getDepartment().equalsIgnoreCase("IT")).mapToDouble(Emp::getSalary).average().getAsDouble();
//        System.out.println("avg "+avg);
        list.stream().filter(x->x.getDepartment().equalsIgnoreCase("IT")).forEach(x->x.setSalary((x.getSalary()*10)/100+x.getSalary()));
        System.out.println("after "+list);
        System.out.println("max "+list.stream().mapToDouble(x->x.getSalary()).min().getAsDouble());
       Map<String,Double>avgMap= list.stream().collect(Collectors.groupingBy(Emp::getDepartment,Collectors.averagingDouble(Emp::getSalary)));


    }
}


class SalaryIncrement{
    public static void main(String[] args) {
        List<Emp> list= Arrays.asList(new Emp("Gokul","IT","24",25000),
                new Emp("rp","IT","23",26100),
                new Emp("nithul","IT","27",30000),
                new Emp("leo","vet","2",45000),
                new Emp("rcp","medical","27",261000),
                new Emp("Raj","edu","60",300000));

//        list.stream().filter(x->x.getDepartment().equalsIgnoreCase("IT")).forEach(x-> x.setSalary((x.getSalary()*10/100)+x.getSalary()));
        System.out.println("sum "+list.stream().filter(x->x.getDepartment().equalsIgnoreCase("IT")).mapToDouble(Emp::getSalary).sum());

        System.out.println(list);
    }
}
class Emp{
    private String name;
    private String department;
    private String Age;
    private double Salary;
    Emp(String name,String department,String Age,double Salary){
        this.name=name;
        this.department=department;
        this.Age=Age;
        this.Salary=Salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", Age='" + Age + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
