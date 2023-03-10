package Encapsulation;

public class Person {
    private int id;
    private String name;
    private int age;
    private boolean man;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>1&&age<100){
            this.age = age;
        }else {
            System.out.println("别瞎打");
        }
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }
}

