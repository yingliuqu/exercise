package Arrays;

public class TestForeach {
    public static void main(String[] args) {
        int[] a = new int[4];
        //数组的初始化
        for (int i=0;i<a.length;i++){
            a[i]=10*i;
        }
        //for循环读取数组a
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        //foreach读取数组a
        System.out.println();
        for (int m:a) {
            System.out.print(m+" ");
        }
        String[] b = {"aa","bbb","ccc","dddd"};//静态初始化
        for (String b1:b) {
            System.out.print(b1);
        }
    }
}
