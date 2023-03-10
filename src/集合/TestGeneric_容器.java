package 集合;
/**
 * 泛型
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestGeneric_容器 {
    public static void main(String[] args) {
        MyCollection  mc = new MyCollection();
        mc.set(false,1);
        mc.set(225,2);
        mc.set("lmy",3);
        String a = (String) mc.get(3);
        int b = (int) mc.get(2);
        System.out.println(a);
        System.out.println(b);


        List<String> list = new ArrayList<>();
        list.add("wula");
        list.add("wula");
        list.set(0,"lmy");
        System.out.println(list);

    }
}




class MyCollection<E> {
    Object[] objs = new Object[5];

    public void set(E e, int index) {
        objs[index] = e;
    }

    public E get(int index) {
        return /*强转成E型*/(E)objs[index];
    }
}

