package 集合;
/**
 * 自定义实现一个ArrayList,体会底层原理
 * 添加set和get方法
 * 增加数组边界的检查
 */

import jdk.nashorn.internal.ir.ReturnNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList03<E> {
    private Object[] elementData;
    private int size;

    public static final int DEFALT_CAPACITY = 10;

    public ArrayList03(){
        elementData = new Object[DEFALT_CAPACITY];
    }

    public  ArrayList03(int capacity){

        if (capacity<0){
            throw new  RuntimeException("容器的容量不能为负数");
        }else if (capacity==0){
            elementData = new Object[DEFALT_CAPACITY];
        }else {
            elementData = new Object[capacity];
        }


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


    //检查索引合法
    public void checkRange(int index){
        //索引合法判断[0,size)左闭右开
        if(index<0||index>size-1){
            throw new RuntimeException("索引不合法:"+index);//不合法手动抛出异常
        }
    }

    //set方法
    public void set(int index,E element){

        checkRange(index);

        elementData[index] = element;
    }

    //get方法
    public E get(int index){

        checkRange(index);

        return (E) elementData[index];
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
        ArrayList03 s1 = new ArrayList03(20);
        for (int i=0;i<40;i++){
            s1.add("高"+i);
        }
        s1.set(15,"李梦圆");
        s1.get(2);
        System.out.println(s1);
        System.out.println(s1.get(10));

    }
}

