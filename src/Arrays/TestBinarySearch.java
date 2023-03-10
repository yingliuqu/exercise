package Arrays;

import java.util.Arrays;

/**
 * 二分法查找
 */
public class TestBinarySearch {
    public static void main(String[] args) {
        int[] a = {3,1,6,2,9,0,7,4,5,8};
        Arrays.sort(a);
        //要查找的值
        int value = 5;
        System.out.println(MyBinarySearch(a,4));
    }
    //二分查找
    public static int MyBinarySearch(int[] a,int value){
        int low=0;
        int high=a.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(value==a[mid]){
                return mid;
            }
            if (value>a[mid]){
                low = mid+1;
            }
            if (value<a[mid]){
                low = mid-1;
            }
        }
        return -1;
    }
}
