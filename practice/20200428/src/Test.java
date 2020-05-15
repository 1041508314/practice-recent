import java.util.Arrays;

/**
 * @program: 20200428
 * @description
 * @author: LiuXinYu
 * @create: 2020-04-28 15:39
 **/

class Testdemo1{
//    public static void hello(){//静态的不依赖对象
//        System.out.println("hello");
//    }
//}
//public class Test {
//    public static void main1(String[] args) {
//        Testdemo1 test = null;//引用空对象
//        Testdemo1.hello();//可以调用方法 但是有警告  真正的需要类名来调用静态方法
//    }
//
//
//    public static void main2(String[] args) {
//        String s = "123";//String s 未初始化   需要String s = "123"初始化后 才能使用
//        System.out.println("s=" + s);
//    }
//
//
//    public int aMethod() {//实例数据成员中不能有静态的  他的调用依赖对象
//        int i = 0;//static int i = 0;//静态的最先被调用 //此处编译失败
//        i++;
//        return i;
//    }
//
//    public static void main3(String[] args) {
//        Test test = new Test();
//        test.aMethod();
//        int j = test.aMethod();
//        System.out.println(j);
//    }
//
//
//    private float f = 1.0f;
//    int m = 12;
//    static int n = 1;
//
//    public static void main4(String[] args) {
//        Test t = new Test();
//    }
//
//
//    private int count;
//
//    public static void main5(String[] args) {
//        Test test = new Test(88);
//        System.out.println(test.count);
//    }
//    Test(int a){
//        count = a;
//    }

    public static void func(int[] array1, int[] array2){
        for (int i = 0; i < array1.length; i++) {
            int tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {88,77,66,55,44};
        func(array1,array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}







