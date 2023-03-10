package Encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(1222);
    }
}


 class Human{
    private int age;
    void sayAge(){
        System.out.println(age);
    }
}
