package 集合;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试HashMap的使用
 */
public class TestMap {
    public static void main(String[] args) {

        Map<Integer,String> mp = new HashMap<>();
        mp.put(1,"one");
        mp.put(2,"two");
        mp.put(3,"three");
        mp.put(4,"four");
        System.out.println(mp.keySet());
//        mp.remove(4);
//        System.out.println(mp.get(1));
//        System.out.println(mp.size());
//        System.out.println(mp.isEmpty());
//        System.out.println(mp.containsKey(1));
//        System.out.println(mp.containsValue("four"));
//        Map<Integer,String> mp1 = new HashMap<>();
//        mp1.put(5,"伍");
//        mp1.put(6,"六");
//        mp.putAll(mp1);
//        System.out.println(mp);
//
//        mp.clear();
//        System.out.println(mp);

    }
}
