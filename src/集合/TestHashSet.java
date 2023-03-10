package 集合;
/**
 * Set无顺序 不可重复
 * List有顺序 可重复
 */

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aa");
        set.add("bb");
        set.add("cc");
        System.out.println(set);

    }
}
