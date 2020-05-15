/**
 * @program: 20200427
 * @description
 * @author: LiuXinYu
 * @create: 2020-04-27 15:29
 **/

class Person{
    private String name;
    private int age;
    public static int count = 0;

    public Person(){
        //this("caocao",18);
        System.out.println("Person<init>");
    }

    public Person(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("Person<String,int>");
    }

    public static void func(){
        count = 99;
    }

    //如果静态方法里面 访问了实例成员变量 那么这个实例成员变量是依赖对象的 但是静态方法不依赖
    static{
        //this.name = "zhangfei";//不能访问非静态的数据成员
        count = 99;
        System.out.println("静态代码块 ......");
    }//静态的内容 只会被执行一次 且是最早被执行的
    //先静态代码块 然后实例代码块 然后构造方法
    //如果都是静态的  那么和定义的前后顺序有关

    {
        //this.name = "zhangfei";
        //count = 99;
        System.out.println("实例代码块......");
    }





    public Person(String name) {
        this.name = name;
    }
    //    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void eat(){
        System.out.println(this.getName());
        System.out.println(this.age);
    }
}
//this关键字不代表对象 是当前对象的引用
//注意：只能在构造方法里面写  只能调用一次 只能写在第一行
//this() 调用自己的构造方法
//this.data 调用当前对象的属性
//this.func() 调用当前对象的方法

/**
 * 构造方法 1.为对象分配内存 2.调用合适的构造方法
 * 他的方法名是和类名相同的 且没有返回值
 * 1.当没有提供构造方法的时候 编译器会自动提供一个不带有参数的构造方法
 * 2.当提供了构造方法的时候 编译器会不自动生成一个构造方法了
 */
public class Test {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.eat();

        new Person().eat();//没有引用的对象称为匿名对象  匿名对象只能在创建对象时使用  如果一个对象只使用一次，可以考虑使用匿名对象
    }

    public static void main2(String[] args) {
        System.out.println(Person.count);
//        Person person1 = new Person();
//        System.out.println("===========");
//        Person person2 = new Person();
    }

    public static void main1(String[] args) {
        Person person1 = new Person();
        //System.out.println(person1);
        //Person person2 = new Person("bit",19);
        //System.out.println(person2);
    }
}
