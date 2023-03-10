package 集合;
/**
 * 自定义一个链表
 * 增加get
 */

import java.util.LinkedList;

public class LinkedList02 {
    private Node first;
    private Node last;
    private int size;

    //get方法
    public Object get(int index) {
        //如果要查找的index小于0 或者大于最后一个索引size-1  则抛出异常
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("索引不合法" + index);
        }
        Node temp = first;

        //优化
        //如果查找的index小于总长度的一半 就直接从头找 如果大于则从后往中间找
        if (index <= (size >> 1)) {
            temp = first;
            for (int i = 0; i < index ; i++) {
                temp = temp.next;
            }
        } else {
            temp = last;
            for (int i = size-1; i > index; i--) {
                temp = temp.previous;
            }

        }
        return temp.element;
    }

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
        //添加进来的Node节点
        Node node = new Node(obj);

        if (first==null){

//            node.previous = null;  //写不写都是空   因为链表为空 只有一个元素
//            node.next = null;

            first = node;
            last = node;
        }else {//不为空
            //添加进来的元素的previous上一个节点位置存上一个last位置
            node.previous = last;
            //添加进来的元素的next下一个节点位置存null  因为添加进来的就是最后一个了
            node.next = null;
            //之前的last节点的next下一个节点位置存上刚add进来的元素的位置
            last.next = node;
            //把node变为新的last
            last = node;
        }
        size++;
    }

    public static void main(String[] args) {
        LinkedList02 list=new LinkedList02();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println(list.get(5));
        System.out.println(list);
    }
}
