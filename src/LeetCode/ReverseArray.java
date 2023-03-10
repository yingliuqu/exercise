package LeetCode;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray r = new ReverseArray();
        System.out.println(r.rotateString("abcd","dabc"));
    }

    public boolean rotateString(String s, String goal) {
        //将两个字符串变为char数组
        char[] a = s.toCharArray();
        char[] b = goal.toCharArray();
        for(int i=0;i<a.length;i++){
            char[] c = new char[a.length];
            //数组颠倒
            System.arraycopy(a,0,c,1,a.length-1);
            c[0] = a[a.length-1];
            //比较
            if(Arrays.equals(c,b)){
                return true;
            }
            a=c;
        }
        return false;
    }
}
