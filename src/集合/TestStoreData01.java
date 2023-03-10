package 集合;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 测试存储表格数据
 * 体会ORM思想：
 * 每一行使用一个javabean存储， 多行使用放到map或list中
 */
public class TestStoreData01 {
    public static void main(String[] args) {
        User user1 = new User(101,"张三",20000,"2005.4.4");
        User user2 = new User(102,"李四",10000,"2015.7.8");
        User user3 = new User(103,"王五",8000,"2021.6.5");

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        for (User u:list) {
            System.out.println(u);
        }

    }
}
class User{
    private int id;
    private String name;
    private double salary;
    private String hireDate;

    public User(){

    }
    public User(int id, String name, double salary, String hireDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}