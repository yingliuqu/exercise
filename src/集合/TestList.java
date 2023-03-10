package 集合;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 测试Collection接口中的方法
 */
public class TestList {
    public static void main(String[] args) {
    test03();

//        List<String> c = new ArrayList<String>();
//        c.add("aa");//向容器中添加元素
//        c.add("bb");
//        c.add("cc");
//        System.out.println(c);
//        System.out.println(c.contains("刘六"));//包含刘六吗
//        System.out.println(c.size());//返回容器中有多少元素
//        Object[] obj =c.toArray();//转换成object数组
//        System.out.println(Arrays.toString(obj));
//
//        System.out.println("##########################");
//        System.out.println(c.isEmpty());//判断容器中是否为空
//
//        System.out.println("##########################");
//        c.remove("张三");//移除的是地址 并不是删除
//        System.out.println(c);
//        System.out.println(c.size());
//
//        c.clear();//清空
//        List<String> c1 = new ArrayList<String>();
//        c1.add("aa");//向容器中添加元素
//        c1.add("dd");
//        c1.add("ee");
//        System.out.println(c1);
//        c.addAll(c1);
//        System.out.println("list1"+c);
//        c.retainAll(c1);
//        System.out.println("list1"+c);
//        System.out.println(c.containsAll(c1));
//        c.removeAll(c1);
//        System.out.println("list1"+c);




//        List<String> l1 = new ArrayList<String>(20);
//        List<String> l2 = new ArrayList<String>(15);
//        l2.add(1,"aa");
//        l2.add(2,"bb");
//        l2.add(3,"cc");
//        l2.add(4,"dd");
//        l2.add(5,"ee");
//        l2.add(6,"ff");
//        l1.addAll(0,l2);
//        System.out.println(l2);
//





    }
    public static void test03(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);
        list.add(2,"李梦圆");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(2,"李");
        System.out.println(list);
        System.out.println(list.indexOf("D"));
        System.out.println(list.lastIndexOf("D"));

    }
}

