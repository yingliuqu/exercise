package Arrays;

/**
 * 测试多维数组
 */
public class TestDimensionArray {
    public static void main(String[] args) {
        //int[] a = new int[5];
        //Car[] cars = new Car[3];

        //动态初始化
        int[][] a = new int[3][];
        a[0] = new int[]{20,30};
        a[1] = new int[]{10,15,80};
        a[2] = new int[]{50,60};
        //静态初始化
        int[][] b = {{20,30},{10,15,80},{50,60}};
    }
}
class Car{

}