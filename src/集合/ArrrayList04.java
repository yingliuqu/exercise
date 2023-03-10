package 集合;

import sun.security.util.Length;

/**
 * 自定义实现一个ArrayList,体会底层原理
 * 添加删除remove方法
 */

public class ArrrayList04<E> {
    private Object[] elementData;
    private int size;

    public static final int DEFALT_CAPACITY = 10;

    public ArrrayList04(){
        elementData = new Object[DEFALT_CAPACITY];
    }

    public ArrrayList04(int capacity){
        //判断容器容量是否为负
        if (capacity<0){
            throw new  RuntimeException("容器的容量不能为负数");
        }else if (capacity==0){
            elementData = new Object[DEFALT_CAPACITY];
        }else {
            elementData = new Object[capacity];
        }
    }
    //查看size
    public int size(){
        return size;
    }

    //判断是否为空
    public boolean isEmpty(){
        if (size==0){
            return true;
        }else {
            return false;
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
    //移除方法
    public void remove(int index){
        int removenumber = elementData.length-index-1;
        if (removenumber>0) {
            System.arraycopy(elementData, index + 1, elementData, index, elementData.length - index - 1);
        }
        elementData[--size]=null;
    }

    //寻找需要移除的元素
    public void remove(E element){
        //element,将它和所有元素挨个比较，获得第一个比较为true的，返回
        for (int i=0 ;i<size;i++){
            if (element.equals(get(i))){//容器中所有的比较方法用的都是equals方法 而不是==

                //将该元素从此处移除
               remove(i);
         }
        }
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


    public static void main(String[] args)  {
        ArrrayList04 s1 = new ArrrayList04(20);
        for (int i=0;i<40;i++){
            s1.add("高"+i);
        }
//        s1.set(15,"李梦圆");
//        s1.get(2);

        s1.remove("李梦圆");
        s1.remove(5);

        //外界调用size属性
        System.out.println(s1.size());

        System.out.println(s1.isEmpty());

        System.out.println(s1);
        System.out.println(s1.get(10));
    }
}

