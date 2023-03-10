package Exam1;

/**
 * 子类改写父类
 *
 */

public class TestOverread {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.run();
    }

}



class Vehicle{
        //方法
    public void run(){
        System.out.println("run");
        }
        //方法
    public void stop(){
        System.out.println("stop");
        }
        //方法
    public Person whoIsPsg(){
        return new Person();
    }
}



class Horse extends Vehicle {
    //重写父类
    //方法
    public void run(){
        System.out.println("策马奔腾");
    }
    //重写父类
    //方法
    public Student whoIsPsg(){
        return new Student("string",2,"sss");
    }
}
