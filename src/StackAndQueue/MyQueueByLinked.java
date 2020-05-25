package StackAndQueue;

public class MyQueueByLinked{
    static class Node{
        public int val;
        Node next=null;

        public Node(int val){
            this.val=val;
        }
    }
    private Node head=null;
    private Node tail=null;
    //入栈
    public void offer(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        tail.next=newNode;
        tail=tail.next;
    }

    //出栈
    public Integer poll(){
        if(head==null){
            return -1;
        }
        int ret=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        return ret;
    }

    //取队首元素
    public Integer peek(){
        if(head==null){
            return null;
        }
        return head.val;
    }
}
