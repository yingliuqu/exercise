package 集合;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试Map的常用方法
 */
public class TestMap1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001,"lmy1",8000);
        Employee e2 = new Employee(1002,"lmy2",12000);
        Employee e3 = new Employee(1003,"lmy3",20000);
        Employee e4 = new Employee(1004,"lmy4",30000);


        //Map存储职员信息
        Map<Integer,Employee> map = new HashMap<>();
        //存放
        map.put(1001,e1);
        map.put(1002,e2);
        map.put(1003,e3);
        //键重复  新的会覆盖旧的
        map.put(1001,e4) ;

        Employee employee = map.get(1001);
        System.out.println(employee.getName());
        System.out.println(map);
    }
}

class Employee{
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}