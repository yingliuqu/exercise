package 集合;
/**
 * 用treeMap的comparable接口来规定排序规则
 */

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> treeMap= new TreeMap<>();
        treeMap.put(1,"aa");
        treeMap.put(2,"bb");
        treeMap.put(3,"cc");
        treeMap.put(4,"dd");

        //按照key递增的方式排序
        for (Integer key:treeMap.keySet()){
            System.out.println(key+":"+treeMap.get(key));
        }

        Map<Emp,String> treeMap1 = new TreeMap<>();
        treeMap1.put(new Emp(100,"张三",50000),"好");
        treeMap1.put(new Emp(101,"李四",20000),"中");
        treeMap1.put(new Emp(102,"王五",5000),"差");
        treeMap1.put(new Emp(102,"赵六",30000),"中上");

        System.out.println(treeMap1);

    }
}

class Emp implements Comparable<Emp>{
    int id;
    String name;
    double salary;

    public Emp(int id, String name, double salary) {
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
    public int compareTo(Emp o) {
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