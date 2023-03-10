package 集合;
/**
 * 自定义一个链表
 * 增加插入节点功能 add(int index,Object obj)
 * 添加泛型
 */

import java.util.LinkedList;

public class LinkedList04<E> {
    //一个Node包括三部分 previous element next
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

    //判断索引是否合法的方法
    private void checkRange(int index) {
        //如果要查找的index小于0 或者大于最后一个索引size-1  则抛出异常
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("索引不合法" + index);
        }
    }

    //封装查找元素的方法
    private Node getNode(int index){
        Node temp = null;
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
        return temp;
    }

    //get方法
    public E get(int index) {
        //检查索引是否合法
        checkRange(index);
        //定义一个临时temp存找到的元素
        Node temp = getNode(index);

        return temp!=null? (E) temp.element :null;//判断一下temp是否为空
    }




    //add方法 添加元素
    public void add(E element){
        //添加进来的Node节点
        Node node = new Node(element);

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

    //插入功能 add(int index,Object obj)
    public void add(int index,E element){
        //检查索引是否合法
        checkRange(index);
        Node newNode = new Node(element);
        Node temp = getNode(index);

        if (temp!=null) {
            Node up = temp.previous;

            up.next = newNode;
            newNode.previous = up;

            newNode.next = temp;
            temp.previous = newNode;
        }
        size++;
    }

    public void addFirst(E element){
        Node f = first;
        Node newNode = new Node(null, element,f);
        if(f==null){
            last=newNode;
        }else {
            f.previous=newNode;
        }
        //toString 的打印一定要从first
        first=newNode;
        size++;
    }


    //删除方法 remove
    public void remove(int index){
        //检查索引是否合法
        checkRange(index);
        Node temp = getNode(index);
        if (temp!=null) {
            Node up = temp.previous;//前一个节点
            Node down = temp.next;//后一个节点
            if (up!=null) {
                up.next = down;
            }
            if (down!=null){
                down.previous = up;
            }
            //删的是第一个 就直接把down赋值给第一个节点first
            if (index==0){
                first = down;
            }
            //删的是最后一个 就把up赋值给最后一个节点last
            if (index==size-1){
                last = up;
            }
            size--;
        }
    }


    public static void main(String[] args) {
        LinkedList04<String> list=new LinkedList04<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        //list.remove(0);
        //list.remove(4);

        list.addFirst("Z");
        list.add("W");

        list.add(1,"V");
        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println(list.size);

//        LinkedList list2 = new LinkedList();
//        list2.add(2);
//        list2.addFirst("z");
//        System.out.println(list2);
    }
}
