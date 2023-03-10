package Arrays;

public class test1 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        String[] arr2 = new String[10];
        User[] arr3 = new User[3];

//逐个赋值
//        arr1[0] = 13;
//        arr1[1] = 13;
//        arr1[2] = 13;
        //遍历给arr1赋值
        for (int i=0;i<arr1.length;i++){
            arr1[i] = 10*i;
        }
        //打印arr1
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        arr3[0] =new User(1001,"laoda");
        arr3[1] =new User(1002,"laoer");
        arr3[2] =new User(1003,"laosan");


        for (int i = 0;i<arr3.length;i++){
            System.out.println(arr3[i].getName());
        }
    }
}

 class User{
    private int age;
    private String name;

    public User(int age, String name) {
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