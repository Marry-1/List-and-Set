package LinkedList;

class Node{
        int data;
        Node next=null;

       public Node(int data) {
        this.data = data;
        }
}
public class LinkedListDemo {
    private Node head = null;

    public void addFirst(int data) {
        //1.根据data值构建一个node结点
        Node node = new Node(data);
        //2.如果是空链表
        if (head == null) {
            head = node;
            return;
        }
        //3.如果不是空链表
        node.next = head;
        head = node;
    }

    public void addLast(int data) {
        //1.根据data值构建一个node结点
        Node node = new Node(data);
        //2.如果是空链表
        if (head == null) {
            head = node;
            return;
        }
        //3.如果不是空链表，就先要找到最后一个节点
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        //循环结束之后，就找到对应的节点了
        tail.next = node;
    }

    public void display() {
        //把链表中每个元素都打印出来
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.data + " ");
        }
        System.out.println();
    }

    public int getSize() {
        int size = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }

    public boolean addIndex(int index, int data) {
        //任意位置插入，下标从0开始
        //1.先判断index是否有效
        int size = getSize();
        if (index < 0 || index > size) {
            return false;
        }
        //2.如果index=0，相当于头插
        if (index == 0) {
            addFirst(data);
            return true;
        }
        //3.如果index=size,相当于尾插
        if (index == size) {
            addLast(data);
            return true;
        }
        Node node=new Node(data);
        //4.如果index处于中间位置
        //1）先找到index的前一个元素
        Node prev = getPos(index-1);
        node.next=prev.next;
        prev.next=node;
        return true;
    }
    public Node getPos(int index){
        Node cur=head;
        for (int i = 0; i < index; i++) {
            cur=cur.next;
        }
        return cur;
    }
    public boolean contains(int toFind){
        for(Node cur=head;cur!=null;cur=cur.next){
            if(cur.data==toFind){
                return true;
            }
        }
        return false;
    }
    public void remove(int toRemove){
        //1.先判断要删除的元素是不是头结点
        if(head.data==toRemove){
            head=head.next;
            return;
        }
        //2.不是头节点，首先要找到删除元素的前一个元素
        Node prev=searchPrev(toRemove);
        //3.改变引用
        //  prev.next=prev.next.next;
        Node toDelete=prev.next;
        prev.next=toDelete.next;

    }
    public Node searchPrev(int toFind){
        for(Node cur=head;cur!=null&&cur.next.next!=null;cur=cur.next){
            if(cur.next.data==toFind){
                return cur;
            }
        }
        return  null;
    }
    public void removeAll(int toRemove){
        //1.如果要删除的元素不是头结点的话
        Node prev=head;
        Node cur=head.next;
        while(cur!=null){
            if(cur.data==toRemove){
                prev.next=cur.next;
                cur=prev.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        //2.如果要删除的是头节点
        if(head.data==toRemove){
            head=head.next;
        }
    }
    public void clear(){
        head=null;
    }
}
