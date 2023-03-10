package 集合;

import java.util.Set;
import java.util.TreeSet;

/**
 * 测试TreeSet的使用
 */
public class TestTreeSet {
    public static void main(String[] args) {
        Set s = new TreeSet();
        s.add("aa");
        s.add("bb");
        s.add("cc");
        for (Object o:s) {
            System.out.print(o+" ");
        }

        Set<Emp1> s1 = new TreeSet<>();
        s1.add(new Emp1(100,"张三",50000));
        s1.add(new Emp1(101,"李四",20000));
        s1.add(new Emp1(102,"王五",5000));
        s1.add(new Emp1(102,"赵六",30000));
        System.out.println(s1);
    }
}
class Emp1 implements Comparable<Emp1>{
    int id;
    String name;
    double salary;

    public Emp1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Emp1 o) {
        if (this.salary>o.salary){
            return 1;
        }else if(this.salary == o.salary){
            return 0;
        }else if(this.salary < o.salary){
            return -1;
        }
        return 0;
    }
}