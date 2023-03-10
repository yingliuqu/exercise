package 集合;

/**
 * 节点对象
 */

public class Node {
    //pervious前一个节点位置  element元素  next下一个节点位置
        Node previous;//指向上一个节点位置
        Object element;//元素数据
        Node next;//指向下一个节点位置



    public Node(Node previous,Object element,Node next) {
        this.previous = previous;
        this.next = next;
        this.element = element;
    }

    public Node(Object element) {
        this.element = element;
    }
}
