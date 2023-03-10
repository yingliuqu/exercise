package Encapsulation;

import java.util.Scanner;

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a = new Animal();  //自动向上转型

        Animal c = new Cat();

        Animal d = new Dog();
//        Dog d2 = (Dog)d ;    //强制向下转型
        Scanner sc = new  Scanner(System.in);
        String i = sc.nextLine();
        if(i.equals("a")){
            animalCry(a);
        }else if (i.equals("c")){
            animalCry(c);
        }else if (i.equals("d")){
            animalCry(d);
        }


    }

    static void animalCry(Animal a){
        a.shout();
    }
}

class Animal{
    public void shout(){
        System.out.println("叫了一声");
    }
}
class Dog extends Animal {
    public void shout(){
        System.out.println("汪汪汪");
    }
}
class Cat extends Animal {
    public void shout(){
        System.out.println("喵喵喵");
    }
}