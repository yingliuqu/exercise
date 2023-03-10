package Arrays;
/**
 * 冒泡排序
 */

import java.util.Arrays;

public class TestBubbleSort {
    public static void main(String[] args) {
        int[] a = {3,1,6,2,9,0,7,4,5,8};
        int temp;
        for (int i=0;i<a.length-1;i++){
            boolean flag = true;
            for (int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = false;
                }
                System.out.println(Arrays.toString(a));
            }
            if (flag){
                System.out.println("结束！！！！！");
                break;
            }
            System.out.println("###########");
        }
    }
}
