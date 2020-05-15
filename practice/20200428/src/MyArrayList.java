import java.util.Arrays;

/**
 * @program: 20200428
 * @description
 * @author: LiuXinYu
 * @create: 2020-04-28 17:30
 **/
public class MyArrayList {
    public int[] elem;//数组
    public int usedSize;//有效的数据个数
    public static final int intCapacity = 10;//初始容量

    public MyArrayList(){
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }


    //打印顺序表
    public void display(){
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }



    //在pos位置新增元素
    private boolean isFull(){
//        if(this.usedSize == this.elem.length){
//            return true;
//        }
//        return false;
        return this.usedSize == this.elem.length;
    }


    //检测的方法
    private void checkPos(int pos){
        if(pos<0 || pos > this.usedSize){
            throw new RuntimeException("pos位置不合法！");
        }
    }

    public void add(int pos, int data){
        checkPos(pos);
        if (isFull()){//判断数组是否放满了
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);//数组长度二倍扩容 并把原数组放进去
        }
        if(pos < 0 || pos > this.usedSize){
            return;
        }
        for (int i = this.usedSize-1; i >=  pos ; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }


    //判断是否包含某个元素
    public boolean contains(int toFind){
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind){
                return true;
            }
        }
        return false;
    }


    //查找某个元素对应的位置
    public int search(int toFind){
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }




    //获取pos位置的元素
    private boolean isEmpty(){
        return this.usedSize == 0;
    }
    public int getpos(int pos){
        //1.顺序表是否为空
        if(isEmpty()){
            //return -1;
            throw new RuntimeException("顺序表为空！");//手动抛出异常
        }
//        //2.pos 合法性
        if(pos < 0 || pos >= this.usedSize){
            throw new RuntimeException("pos位置不合法！");
        }
        //checkPos(pos);
        return this.elem[pos];
    }


    //给pos位置的元素设为value
    public void setPos(int pos,int value){
        if(pos < 0 || pos >= this.usedSize){
            throw new RuntimeException("pos位置不合法！");

        }
        this.elem[pos] = value;
    }


    //删除第一次出现的关键字key
    public void remove(int toRemove){
        //1.找key数字在哪里 并知道它的下标
        //2.让后面的值覆盖前面的值
        int index = search(toRemove);
        if(index == -1){
            System.out.println("没有需要删除的数字！");
            return;
        }
        for (int i = index; i < this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }



    //获取顺序表长度
    public int size(){
        return this.usedSize;
    }



    //清空顺序表
    public void clear(){
        this.usedSize = 0;
    }
}

