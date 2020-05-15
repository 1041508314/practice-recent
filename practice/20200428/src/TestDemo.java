/**
 * @program: 20200428
 * @description
 * @author: LiuXinYu
 * @create: 2020-04-28 17:03
 **/
class MyValue{
   public int val;
}
public class TestDemo {
    private static void swap(MyValue myValue1,MyValue myValue2){
        int tmp = myValue1.val;
        myValue1.val = myValue2.val;
        myValue2.val = tmp;
    }

    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        myValue1.val = 10;
        MyValue myValue2 = new MyValue();
        myValue2.val = 20;
        System.out.println(myValue1.val);
        System.out.println(myValue2.val);
        System.out.println("开始交换");
        swap(myValue1,myValue2);
        System.out.println(myValue1.val);
        System.out.println(myValue2.val);
    }
}
