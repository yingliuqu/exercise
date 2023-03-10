package 集合;

import java.util.*;

/**
 * 测试迭代器Iterator遍历LIst Set Map
 */
public class TestIterator {
    public static void main(String[] args) {
        TestIteratorList();
        TestIteratorSet();
        TestIteratorMap();
    }
    public static void TestIteratorList(){
        List<String> l = new ArrayList<>();
        l.add("aa");
        l.add("bb");
        l.add("cc");

      for (Iterator<String> iter = l.listIterator();iter.hasNext();){
          String temp = iter.next();
          System.out.print(temp+" ");
      }
    }

    public static void TestIteratorSet(){
        Set<String> s = new HashSet<>();
        s.add("dd");
        s.add("ee");
        s.add("ff");

        for (Iterator<String> iter = s.iterator();iter.hasNext();){
            String temp = iter.next();
            System.out.print(temp+" ");
        }
    }
    //第一中遍历map的方式
    public static void TestIteratorMap(){
        Map<Integer,String> m = new HashMap<>();
        m.put(7,"gg");
        m.put(8,"hh");
        m.put(9,"ii");

        Set<Map.Entry<Integer,String>> ss = m.entrySet();
        for (Iterator<Map.Entry<Integer,String>> iter = ss.iterator();iter.hasNext();){
            Map.Entry<Integer,String> temp = iter.next();
            System.out.print(temp.getKey()+"--");
            System.out.print(temp.getValue()+"  ");
        }
        //第二种遍历map的方式
        Set<Integer> keyset = m.keySet();
        for (Iterator<Integer> iter = keyset.iterator();iter.hasNext();){
            int key = iter.next();
            System.out.print(key+"---"+m.get(key)+"  ");

        }

    }
}

