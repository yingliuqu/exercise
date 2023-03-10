/**
 * 测试抽象类，抽象方法
 * 子类必须实现抽象父类的方法  相当于模板
 */
public abstract class AnimalA {//抽象类
    abstract public void shout();//抽象方法
    public void run(){
        System.out.println("跑啊跑");
    }
    //子类实现抽象父类的shout方法
    static class  Dog extends AnimalA {
        public void shout(){
            System.out.println("www");
        }
    }

    public static void main(String[] args) {
        AnimalA a= new Dog();
    }
}
