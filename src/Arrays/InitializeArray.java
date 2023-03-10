package Arrays;

public class InitializeArray{
    public static void main(String[] args) {

        //静态初始化
        int[] a = {2,3,4,5,6};
        User1[] b={new User1(1001,"yi")
                  ,new User1(1002,"er")
                  ,new User1(1003,"san")
                    };

        //默认初始化
        int[] c = new int[3];


        //动态初始化  先分配空间
        int[] a1=new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
    }
}
class User1{
    private int age;
    private String name;

    public User1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}