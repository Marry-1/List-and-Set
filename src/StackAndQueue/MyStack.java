package StackAndQueue;

public class MyStack {
    //管理一些int元素，也不考虑扩容问题
    private int[] array=new int[100];
    private int size=0;

    //入栈
    public void push(int x){
        array[size]=x;
        size++;
    }
    //取栈顶元素
    public int  peek(){
        return array[size-1];
    }
    //出栈
    public int pop(){
        int ret=array[size-1];
        size--;
        return ret;
    }
}

