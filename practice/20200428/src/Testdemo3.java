/**
 * @program: 20200428
 * @description
 * @author: LiuXinYu
 * @create: 2020-04-28 17:17
 **/
public class Testdemo3 {
    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
//        myArrayList1.add(0,12);
//        myArrayList1.add(1,23);
//        myArrayList1.add(2,34);
//        myArrayList1.add(3,45);
        for (int i = 0; i < 10; i++) {
            myArrayList1.add(i,i);
        }
        myArrayList1.display();
        myArrayList1.add(10,112);
        myArrayList1.display();
        //System.out.println(myArrayList1.getpos(4));
        myArrayList1.remove(4);
        myArrayList1.display();
        System.out.println("clear()");
        myArrayList1.clear();
        myArrayList1.display();
//        System.out.println("====================");
//        System.out.println(myArrayList1.search(5));
//        System.out.println(myArrayList1.contains(15));

    }
}
