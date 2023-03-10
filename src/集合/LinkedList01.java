package 集合;
/**
 * 自定义一个链表
 */

import java.util.LinkedList;

public class LinkedList01 {
    private Node first;
    private Node last;
    private int size;

    //重写一下toString
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("[");
        Node temp = first;
        while (temp!=null){
            sb.append(temp.element+",");
            temp = temp.next;
       }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }


    //add方法 添加元素
    public void add(Object obj){
        Node node = new Node(obj);

        if (first==null){

//            node.previous = null;
//            node.next = null;

            first = node;
            last = node;
        }else {
            node.previous = last;
            node.next = null;

            last.next = node;
            last = node;
        }
    }

    public static void main(String[] args) {
        LinkedList01 list = new LinkedList01();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
    }
}
