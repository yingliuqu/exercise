package Exam1;

public class Extends {
/**
 * 测试继承
 */
public static void main(String[] args) {
    Student stu = new Student("xixi",172, "Java");
    stu.rest();
    stu.study();
    Student stu2 = new Student("xixi",3,"挖掘机专业");
    System.out.println(stu2 instanceof Person);
    System.out.println(new Person() instanceof Object);
    }
}

    class Person{
        String name;
        int height;

    public void rest(){
        System.out.println("休息一下");
    }
}
    class Student extends Person {
        String major;

        public void study(){
            System.out.println("学习一下");
        }

        public Student(String name,int height,String major) {
            this.name = name;
            this.height = height;
            this.major = major;
        }
        
}
