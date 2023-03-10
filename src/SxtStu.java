

class Computer{
    String brand; //定义Computer的品牌属性
}

public class SxtStu {

    //属性
    public int id;
    public int age;
    public String name;
    Computer comp;

    //方法
    void study(){
        System.out.println("我在学习！！！"+comp.brand);
    }
     void relax(){
        System.out.println("我在休息！！！");
    }

    //构造方法，用于创建这个类的对象。无参的构造方法可以由系统自动创建
    SxtStu(){

    }

    public static void main(String[] args) {
        SxtStu stu = new SxtStu(); //创建对象
        stu.id =1001;
        stu.age = 18;
        stu.name = "李梦圆";

        Computer c1 = new Computer();
        c1.brand = "联想";

        stu.comp = c1;
        stu.study();
    }



}
