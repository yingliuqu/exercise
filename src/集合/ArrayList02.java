package 集合;
/**
 * 自定义实现一个ArrayList,体会底层原理
 * 并添加数组自动扩容功能
 */

import jdk.nashorn.internal.ir.ReturnNode;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList02<E> {
    private Object[] elementData;
    private int size;

    public static final int DEFALT_CAPACITY = 10;

    public ArrayList02(){
        elementData = new Object[DEFALT_CAPACITY];
    }

    public  ArrayList02(int capacity){
        elementData = new Object[capacity];
    }

    //向数组里面加元素
    public void add(E element){
        //何时扩容
        if (size==elementData.length){
            //定义一个更大的数组newArray
            Object[] newArray = new Object[elementData.length+(elementData.length>>1)];//左移一位乘二 右移一位除二
            //将原数组的元素拷贝到newArray
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData = newArray;
        }


        elementData[size++] = element;
    }

//重写一下toString
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
        ArrayList02 s1 = new ArrayList02(20);
        for (int i=0;i<40;i++){
            s1.add("高"+i);
        }
        System.out.println(s1);

    }
}

