package Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        String a[] = {"aa", "bb", "vv", "cc", "dd"};
//        remove(a, 2);
        System.out.println();

        a = extend(a, "jb", 2);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

//        String a1[] = new String[10];
//        System.arraycopy(a,2,a1,5,3);
//        for (int i=5;i<8;i++) {
//            System.out.print(a1[i]);
//        }
//        System.out.println();
    }

    //测试数组中删除摸个元素（本质上还是数组的拷贝）
    public static String[] remove(String[] a, int index) {
        String[] a2 = {"a", "b", "c", "d", "e", "f"};
        //                          3        2                   2
        System.arraycopy(a, index + 1, a, index, a.length - index - 1);
        a[a.length - 1] = null;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        return a;
    }

    //数组的扩容 插入一个元素
    public static String[] extend(String[] a, String charu, int index) {
        //扩容
        String[] a1 = new String[a.length + 1];
        System.arraycopy(a, 0, a1, 0, a.length);
        //插入
        System.arraycopy(a1, index, a1, index + 1, a1.length - index - 1);
        a1[index] = charu;

        return a1;
    }
}

