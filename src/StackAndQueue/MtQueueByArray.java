package StackAndQueue;

public class MtQueueByArray {
    //循环队列
    private int[] array=new int[100];
    private int head=0;
    private int tail=0;
    private int size=0;

    //入队列
    public void offer(int val){
        if(size==array.length){
            return;  //队列满了，无法插入
        }
        array[tail]=val;
        tail++;
        if(tail>=array.length){
            tail=0;
        }
        size++;
    }
    //出队列
    public Integer poll(){
        if(size==0){
            return null;
        }
        Integer ret=array[head];
        head++;
        if(head>=array.length){
            head=0;
        }
        size--;
        return ret;
    }

    //取队首元素
    public Integer peek(){
        if(size==0){
            return null;
        }
        return array[head];
    }
}
