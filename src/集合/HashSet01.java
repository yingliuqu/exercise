package 集合;

import java.util.HashMap;

public class HashSet01 {
    HashMap map;
    private static final Object PRESENT = new Object();
    public HashSet01(){
        map = new HashMap();
    }
    public int size(){
        return map.size();
    }
    public void add(Object o){
        map.put(o,PRESENT);
    }
    public void remove(Object o){
        map.remove(o);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');

        //用foreach打印
        for (Object key:map.keySet()/*只打印key 忽视value*/) {
            sb.append(key+",");
        }

        sb.setCharAt(sb.length()-1,'}');
        return sb.toString();
    }

    public static void main(String[] args) {
        HashSet01 hs = new HashSet01();
        hs.add("aa");
        hs.add("bb");
        hs.add("cc");
        System.out.println(hs);
        System.out.println();

    }
}
