import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee implements Comparable<Employee>{

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {


        Set <Employee> employees = Set.of(new Employee("amirah",50),
        new Employee("wunmi",40),new Employee("wunmi",30));
        System.out.println(employees);
        System.out.println(employees.stream().sorted().collect(Collectors.toList()));


        List <Integer> numbers = List.of(1,2,3,4,5,6);
        System.out.println(numbers.stream().reduce(0,(x,y) -> x + y));
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }




}