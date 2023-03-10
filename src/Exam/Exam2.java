package Exam;

//方法的重载
public class Exam2 {
    public static void main(String[] args) {
        System.out.println(add(2,2,5));
        System.out.println(add(222,4466));
        System.out.println(add(2212,220.22));
        System.out.println(add(2.03552,223));
    }
    public static int add(int n1,int n2){
        int sum =n1+n2;
        return sum;
    }

    public static int add(int n1,int n2,int n3){
        int sum=n1+n2+n3;
        return sum;
    }

    public static double add(int n1,double n2){
        double sum=n1+n2;
        return sum;
    }

    public static double add(double n1,int n2) {
        double sum=n1+n2;
        return sum;
    }
}
