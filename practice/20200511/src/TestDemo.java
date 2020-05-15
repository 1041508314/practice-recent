import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/11
 * @Content:
 */
class Money implements Cloneable{
    double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable {
    public int age;

    Money money = new Money();

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
        //1.克隆person
        Person p1 = (Person) super.clone();
        //2.克隆当前的Money对象
        p1.money = (Money) this.money.clone();
        return p1;
    }
}

public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person) person1.clone();
        System.out.println(person1.money.money);
        System.out.println(person2.money.money);
        System.out.println("==========");
        person2.money.money = 99.9;
        System.out.println(person1.money.money);
        System.out.println(person2.money.money);

    }


    public static void main2(String[] args) throws CloneNotSupportedException {
        //如果要克隆自定义类型
        //第一步就是要实现接口  为什么克隆接口是空接口
        // 空接口：也把它叫做标记接口，其实就是只要一个类实现了这个接口，那么就标记这个类是可以进行clone的
        //第二部是要重写clone方法
        Person person1 = new Person();
        Person person2 = (Person) person1.clone();
        System.out.println(person1.age);
        System.out.println(person2.age);
        System.out.println("==========");
        person2.age = 99;
        System.out.println(person1.age);
        System.out.println(person2.age);
    }


    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] array2 = array.clone();
        array2[0] = 99;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
