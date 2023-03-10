package Exam;

import java.util.*;

//数组排序（倒序）
public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        //复制
        int arr1[] = (int[])Arrays.copyOfRange(arr,0,n);
        //正序
        Arrays.sort(arr);

        if(Arrays.equals(arr1,arr)){
            System.out.print("sorted");
        }else {
            //倒序
            int temp=0;
            for(int i=0;i<arr.length-1;i++) {
                for(int j=0;j<arr.length-i-1;j++) {
                    if(arr[j]<arr[j+1]) {
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }

            System.out.println(Arrays.toString(arr));
            if(Arrays.equals(arr1,arr)){
                System.out.print("sorted");
            }else{
                System.out.print("unsorted");
            }
        }
    }
}