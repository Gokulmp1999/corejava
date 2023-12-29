package practice1;

public class Employe implements Comparable<Employe> {
    private String name;
    private int salary;

    public Employe(String name, int salary) {
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
        return "Employe{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employe o) {
        if(this.getSalary()<o.getSalary()){
            return 1;
        }
        else {
            return 0;
        }
    }
}
