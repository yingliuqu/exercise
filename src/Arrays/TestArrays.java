package Arrays;

import java.util.Arrays;

/**
 * 测试Arrays工具类的使用
 */
public class TestArrays {
    public static void main(String[] args) {
        int[] a={88,62,55,44,5};
        String a1[] = {"aa", "bb", "vv", "cc", "dd"};
        System.out.println(a);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));//System.out.println(a.toString());和object中的tostring方法不一样
        System.out.println(Arrays.toString(a1));
    }
}
