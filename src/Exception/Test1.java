package Exception;

public class Test1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Cat c = new Cat();
        if(a!=0) {
            System.out.println(b / a);
        }

        String s = null;
        if (s!=null) {
            s.length();//NullPointerException
        }

        Animal d = new Dog();
        if (d instanceof Cat) {
            Cat c1 = (Cat) d;
        }
        System.out.println(c instanceof Cat);

    }
}


class Animal{

}
class Dog extends Animal{

}
class Cat extends  Animal{

}