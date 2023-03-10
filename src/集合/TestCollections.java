package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 工具类Collection的使用
 */
public class TestCollections {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        for (int i=0;i<10;i++){
            l.add("i");
        }
        System.out.println(l);

        //随机排列
        Collections.shuffle(l);
        System.out.println(l);

        //逆序排列
        Collections.reverse(l);
        System.out.println(l);

        //递增排序
        Collections.sort(l);   //若想直接打印就是递增排序  要使用接口comparable
        System.out.println(l);

        //二分查找l中的元素20
        System.out.println(Collections.binarySearch(l,"20"));
    }
}
