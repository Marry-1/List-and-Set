package SeqList;

public class SeqListDemo {
    //length是容量，size是有效长度
    private int[] datas=new int[100];
    private int size=0;

    public int getSize() {
        return size;
    }

    public void display(){
        //打印顺序表
        String result="[";
        for(int i=0;i<size;i++){
            result+=datas[i];
            if(i<size-1){
                result+=",";
            }
        }
        result+="]";
        System.out.println(result);
    }
    public void add(int pos,int data){
        //在pos位置上插入数值为data的元素
        //判断pos的值是否合法
        if(pos<0||pos>size){
            return;
        }
        //容量不够就扩容
        if(size>=datas.length){
            int[] newDatas=new int[2*datas.length];
            for(int i=0;i<datas.length;i++){
                newDatas[i]=datas[i];
            }
            datas=newDatas;
        }
        //在尾部插入
        if(pos==size){
            datas[pos]=data;
            size++;
            return;
        }
        //在其他位置插入
        for(int i=size-1;i>=pos;i--){
            datas[i+1]=datas[i];
        }
        datas[pos]=data;
        size++;
    }
    public boolean contains(int toFind){
        for(int i=0;i<size;i++){
            if(datas[i]==toFind){
                return true;
            }
        }
        return false;
    }
    public int search(int toFind){
        for(int i=0;i<size;i++){
            if(datas[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    public Integer getPos(int pos){
        if(pos<0||pos>size){
            return null;
        }
        return datas[pos];
    }
    public void setPos(int pos,int data){
        datas[pos]=data;
    }
    public void remove(int toRemove){
        //先查找位置
        int pos=search(toRemove);
        if(pos==-1){
            return;
        }
        //如果在末尾就直接删除
        if(pos==size-1){
            size--;
            return;
        }
        //如果在中间，先删除在搬运
        for(int i=pos;i<size-1;i++){
            datas[i]=datas[i+1];
        }
        size--;
    }
    public void clear(){
        size=0;
    }
}

