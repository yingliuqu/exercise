package 集合;
/**
 * 自定义实现一个ArrayList,体会底层原理
 * 并添加泛型
 */

import jdk.nashorn.internal.ir.ReturnNode;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList01<E> {
    private Object[] elementData;
    private int size;

    public static final int DEFALT_CAPACITY = 10;

    public void ArrayList01(){
        elementData = new Object[DEFALT_CAPACITY];
    }

    public  ArrayList01(int capacity){
        elementData = new Object[capacity];
    }

    public void add(E element){
        elementData[size++] = element;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for(int i=0;i<size;i++){
            sb.append(elementData[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }


    public static void main(String[] args) {
        ArrayList01 s1 = new ArrayList01(20);
        s1.add("aa");
        s1.add("bb");
        System.out.println(s1);

    }
}

