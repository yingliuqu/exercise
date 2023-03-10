package Exam1;

public class OverreadToString {
    public static void main(String[] args) {

        TestOverread to = new TestOverread();
        System.out.println(to.toString());
    }
@Override
    public String toString(){
        return "测试Object对象";
    }
}
class Person2{
    String name;
    int age;
@Override
//方法
    public String toString(){
        return name+"年龄"+age;
    }
    public Person2(String name,int age){
        this.name = name;
        this.age = age;
    }
}
