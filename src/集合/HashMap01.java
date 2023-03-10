package 集合;

import java.util.Arrays;

/**
 * 自定义一个HashMap
 * add和get方法
 */
public class HashMap01<K,V> {

    Node1[] table;//位桶数组。bucket array
    int size;//存放键值对的数量

    //定义位桶数组大小为16
    public HashMap01() {
        table = new Node1[16];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        //遍历bucket数组
        for (int i=0;i<table.length;i++){
            Node1 temp = table[i];
            //遍历链表
            while(temp!=null){
                sb.append(temp.key+":"+temp.value+",");
                temp = temp.next;//遍历
            }
        }
        sb.setCharAt(sb.length()-1,'}');
        return sb.toString();
    }

    //put放入新节点的方法 放的是最后
    public void put(K key,V value){

        //何时扩容
        if (size==table.length*0.75){
            Node1[] newTable = new Node1[table.length<<1];//左移一位乘二
            System.arraycopy(table,0,newTable,0,table.length);
            table = newTable;
        }

        Node1 newNode = new Node1();
        newNode.hash = myHash(key.hashCode(),table.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;

        Node1 temp = table[newNode.hash];
        Node1 iterLast = null;//存放正在遍历最后一个元素尾结点
        boolean keyRepeat=false;
        if (temp==null){
            table[newNode.hash] = newNode;
            size++;
        }else {
            while (temp!=null){
                if (temp.key.equals(key)){
                    temp.value = value;//key相同 只需覆盖value值
                    keyRepeat=true;
                    break;//存完结束循环
                }else {
                    iterLast = temp;//循环的最后一个temp的值赋值给尾结点iterLast 存放最后一个元素  每次put都会改变
                    temp = temp.next; //这是个循环 逐个遍历 temp.next指向temp（null） 结束循环
                }
            }
            if (keyRepeat==false) {
                iterLast.next = newNode;//若key不重复 则将newNode放到尾结点iterLast的后面
                size++;
            }

        }
    }

    public V get(K key){
        int hash = myHash(key.hashCode(),table.length);
        V value = null; //存放返回值
        if (table[hash]!=null){
            Node1 temp = table[hash];
            while (temp!=null){
                if(temp.key.equals(key)){//如果找到了 则返回相应的value
                    value = (V) temp.value;
                    break;
                }else {
                    temp = temp.next; //循环下一个
                }
            }
        }
        return value;
    }

    //https://blog.csdn.net/cs_fang_dn/article/details/104359328?spm=1001.2101.3001.6661.1&utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1.pc_relevant_antiscanv2&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1.pc_relevant_antiscanv2&utm_relevant_index=1
    public void remove(K key){
        int hash = myHash(key.hashCode(),table.length); //先算出输入的key的hash值
        Node1 temp = table[hash];
        Node1 proNode = null;
        if (temp==null){
            System.out.println("没有这个key");
        }else{
            long current = 0L;
            while (temp!=null) {
                if (temp.key.equals(key)) {
                    if (current==0){
                        if (table[hash].next==null) {
                            table[hash] = null;//只有一个的情况
                        }else{
                            table[hash]=temp.next;//第一个 后面还有节点
                        }
                        break;
                    }else {//在中间的情况
                        proNode.next = temp.next;//删除当前节点
                        break;
                    }
                }else {
                    proNode =temp;
                    temp = temp.next;
                    current++;
                }
            }
            size--;
        }
    }

    //计算hash值的方法
    public int myHash(int hCode,int length){
//        System.out.println("hash in myHash:"+(v&(length-1)));//直接位运算 效率高
//        System.out.println("hash in myHash:"+(v%(length-1)));//取模运算 效率低
        return hCode&(length-1);
    }

    public static void main(String[] args) {
        HashMap01<Integer,String> h = new HashMap01<>();
        h.put(1,"aa");
        h.put(2,"bb");
        h.put(3,"cc");
        h.put(4,"190");

        h.put(53,"gg");
        h.put(69,"hh");
        h.put(85,"kk");


        h.remove(69);
        System.out.println(h.get(69));
        System.out.println(h);
//        for (int i=0;i<100;i++){
//            System.out.println(i+":"+ h.myHash(i,16));
//        }

    }
}

